import java.io.*;
import java.util.*;

/**
 * Console Movie Ticket Booking System
 * Features:
 *  - Show movies, show seats, book, cancel, list tickets
 *  - Admin: add/remove movies (PIN: 1234)
 *  - Prevent double booking
 *  - Unique ticket IDs
 *  - File persistence (movies.dat, tickets.dat)
 */
public class Main {

    // ====== MODELS ======
    static class Movie implements Serializable {
        private static final long serialVersionUID = 1L;

        private int movieId;
        private String name;
        private int totalSeats;
        // seats[seatNo] -> true if booked; index 1..totalSeats used (0 unused for simplicity)
        private boolean[] seats;

        public Movie(int movieId, String name, int totalSeats) {
            this.movieId = movieId;
            this.name = name;
            setTotalSeats(totalSeats);
        }

        public int getMovieId() { return movieId; }
        public String getName() { return name; }
        public int getTotalSeats() { return totalSeats; }

        public void setName(String name) { this.name = name; }

        public void setTotalSeats(int totalSeats) {
            if (totalSeats < 1) totalSeats = 1;
            this.totalSeats = totalSeats;
            // reinitialize seats array with size totalSeats + 1 (1-based)
            boolean[] newSeats = new boolean[totalSeats + 1];
            // If there was an old array, copy what fits
            if (this.seats != null) {
                for (int i = 1; i < this.seats.length && i <= totalSeats; i++) {
                    newSeats[i] = this.seats[i];
                }
            }
            this.seats = newSeats;
        }

        public boolean isSeatBooked(int seatNo) {
            if (seatNo < 1 || seatNo > totalSeats) return true; // treat invalid as unavailable
            return seats[seatNo];
        }

        public boolean bookSeat(int seatNo) {
            if (seatNo < 1 || seatNo > totalSeats) return false;
            if (seats[seatNo]) return false;
            seats[seatNo] = true;
            return true;
        }

        public boolean cancelSeat(int seatNo) {
            if (seatNo < 1 || seatNo > totalSeats) return false;
            if (!seats[seatNo]) return false;
            seats[seatNo] = false;
            return true;
        }

        public List<Integer> getAvailableSeats() {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= totalSeats; i++) {
                if (!seats[i]) list.add(i);
            }
            return list;
        }

        @Override
        public String toString() {
            return movieId + " - " + name + " (Seats: " + totalSeats + ", Available: " + getAvailableSeats().size() + ")";
        }
    }

    static class Ticket implements Serializable {
        private static final long serialVersionUID = 1L;

        private int ticketId;
        private String customerName;
        private int seatNumber;
        private int movieId;      // store by id (decouples from Movie instance)
        private String movieName; // snapshot for quick display
        private Date bookedAt;

        public Ticket(int ticketId, String customerName, int seatNumber, int movieId, String movieName) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.seatNumber = seatNumber;
            this.movieId = movieId;
            this.movieName = movieName;
            this.bookedAt = new Date();
        }

        public int getTicketId() { return ticketId; }
        public String getCustomerName() { return customerName; }
        public int getSeatNumber() { return seatNumber; }
        public int getMovieId() { return movieId; }
        public String getMovieName() { return movieName; }
        public Date getBookedAt() { return bookedAt; }

        @Override
        public String toString() {
            return "Ticket #" + ticketId + " | " + movieName + " | Seat " + seatNumber +
                    " | Name: " + customerName + " | " + bookedAt;
        }
    }

    // ====== CORE SYSTEM ======
    static class TicketBookingSystem {
        private final String MOVIES_FILE = "movies.dat";
        private final String TICKETS_FILE = "tickets.dat";

        private List<Movie> movies = new ArrayList<>();
        private Map<Integer, Ticket> tickets = new LinkedHashMap<>();
        private int nextMovieId = 1;
        private int nextTicketId = 1001;

        public TicketBookingSystem() {
            loadData();
            // If no movies, seed some sample data
            if (movies.isEmpty()) {
                seedSampleMovies();
                saveMovies();
            }
            updateIdCounters();
        }

        private void seedSampleMovies() {
            addMovieInternal("Jailer", 20);
            addMovieInternal("Leo", 18);
            addMovieInternal("Vikram", 16);
        }

        private void updateIdCounters() {
            for (Movie m : movies) nextMovieId = Math.max(nextMovieId, m.getMovieId() + 1);
            for (Ticket t : tickets.values()) nextTicketId = Math.max(nextTicketId, t.getTicketId() + 1);
        }

        // ---------- Persistence ----------
        @SuppressWarnings("unchecked")
        private void loadData() {
            // movies
            List<Movie> m = (List<Movie>) readObject(MOVIES_FILE);
            if (m != null) movies = m;

            // tickets
            Map<Integer, Ticket> t = (Map<Integer, Ticket>) readObject(TICKETS_FILE);
            if (t != null) tickets = t;
        }

        private Object readObject(String file) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return ois.readObject();
            } catch (FileNotFoundException e) {
                return null; // first run
            } catch (Exception e) {
                System.err.println("Warning: could not read " + file + " (" + e.getMessage() + ")");
                return null;
            }
        }

        private void saveMovies() {
            writeObject(MOVIES_FILE, movies);
        }

        private void saveTickets() {
            writeObject(TICKETS_FILE, tickets);
        }

        private void writeObject(String file, Object obj) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(obj);
            } catch (Exception e) {
                System.err.println("Error writing " + file + ": " + e.getMessage());
            }
        }

        // ---------- Movie operations ----------
        public List<Movie> getMovies() {
            return Collections.unmodifiableList(movies);
        }

        public Movie findMovieById(int id) {
            for (Movie m : movies) if (m.getMovieId() == id) return m;
            return null;
        }

        public Movie addMovie(String name, int totalSeats) {
            Movie m = addMovieInternal(name, totalSeats);
            saveMovies();
            return m;
        }

        private Movie addMovieInternal(String name, int totalSeats) {
            Movie m = new Movie(nextMovieId++, name, totalSeats);
            movies.add(m);
            return m;
        }

        public boolean removeMovie(int movieId) {
            // Only allow removal if no tickets exist for this movie
            boolean hasTickets = tickets.values().stream().anyMatch(t -> t.getMovieId() == movieId);
            if (hasTickets) return false;
            boolean removed = movies.removeIf(m -> m.getMovieId() == movieId);
            if (removed) saveMovies();
            return removed;
        }

        // ---------- Ticket operations ----------
        public List<Ticket> getAllTickets() {
            return new ArrayList<>(tickets.values());
        }

        public Ticket getTicket(int ticketId) {
            return tickets.get(ticketId);
        }

        public synchronized Ticket bookTicket(int movieId, String customerName, int seatNo) {
            Movie m = findMovieById(movieId);
            if (m == null) throw new IllegalArgumentException("Invalid movie id");
            if (m.isSeatBooked(seatNo)) throw new IllegalStateException("Seat already booked");
            if (!m.bookSeat(seatNo)) throw new IllegalStateException("Invalid seat number");

            Ticket ticket = new Ticket(nextTicketId++, customerName.trim(), seatNo, m.getMovieId(), m.getName());
            tickets.put(ticket.getTicketId(), ticket);
            // persist
            saveMovies();
            saveTickets();
            return ticket;
        }

        public synchronized boolean cancelTicket(int ticketId) {
            Ticket t = tickets.remove(ticketId);
            if (t == null) return false;
            Movie m = findMovieById(t.getMovieId());
            if (m != null) {
                m.cancelSeat(t.getSeatNumber());
                saveMovies();
            }
            saveTickets();
            return true;
        }

        // ---------- Helpers for UI ----------
        public void printMovies() {
            if (movies.isEmpty()) {
                System.out.println("No movies available.");
                return;
            }
            System.out.println("\nAvailable Movies:");
            for (Movie m : movies) System.out.println("  " + m);
        }

        public void printSeats(int movieId) {
            Movie m = findMovieById(movieId);
            if (m == null) {
                System.out.println("Invalid movie ID.");
                return;
            }
            List<Integer> available = m.getAvailableSeats();
            System.out.println("\nSeats for " + m.getName() + " (Total: " + m.getTotalSeats() + ")");
            if (available.isEmpty()) {
                System.out.println("  No seats available.");
                return;
            }
            // print in rows of 10
            int count = 0;
            StringBuilder row = new StringBuilder("  Available: ");
            for (int s : available) {
                row.append(s).append(' ');
                count++;
                if (count % 10 == 0) {
                    System.out.println(row.toString());
                    row = new StringBuilder("             ");
                }
            }
            if (row.toString().trim().length() > 0) System.out.println(row.toString());
        }
    }

    // ====== CONSOLE UI ======
    private static final Scanner sc = new Scanner(System.in);
    private static final TicketBookingSystem system = new TicketBookingSystem();
    private static final String ADMIN_PIN = "1234";

    public static void main(String[] args) {
        while (true) {
            printMainMenu();
            int choice = readInt("Choose option: ");
            switch (choice) {
                case 1 -> system.printMovies();
                case 2 -> handleShowSeats();
                case 3 -> handleBook();
                case 4 -> handleCancel();
                case 5 -> handleShowAllTickets();
                case 6 -> handleAdmin();
                case 7 -> {
                    System.out.println("Goodbye! 👋");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("\n========================================");
        System.out.println("    🎬 Movie Ticket Booking (Console)   ");
        System.out.println("========================================");
        System.out.println("1. Show Movies");
        System.out.println("2. Show Seats");
        System.out.println("3. Book Ticket");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Show All Tickets");
        System.out.println("6. Admin");
        System.out.println("7. Exit");
    }

    private static void handleShowSeats() {
        int id = readInt("Enter Movie ID: ");
        system.printSeats(id);
    }

    private static void handleBook() {
        int movieId = readInt("Enter Movie ID: ");
        Movie m = system.findMovieById(movieId);
        if (m == null) {
            System.out.println("Invalid movie ID.");
            return;
        }
        system.printSeats(movieId);
        String name = readNonEmpty("Enter your name: ");
        int seat = readInt("Choose Seat No: ");
        try {
            Ticket t = system.bookTicket(movieId, name, seat);
            System.out.println("✅ Ticket booked successfully! Ticket ID: " + t.getTicketId());
        } catch (IllegalArgumentException | IllegalStateException ex) {
            System.out.println("❌ " + ex.getMessage());
        }
    }

    private static void handleCancel() {
        int id = readInt("Enter Ticket ID to cancel: ");
        boolean ok = system.cancelTicket(id);
        if (ok) System.out.println("🗑️ Ticket cancelled successfully.");
        else System.out.println("❌ Ticket not found.");
    }

    private static void handleShowAllTickets() {
        List<Ticket> list = system.getAllTickets();
        if (list.isEmpty()) {
            System.out.println("No tickets booked yet.");
            return;
        }
        System.out.println("\nBooked Tickets:");
        for (Ticket t : list) System.out.println("  " + t);
    }

    private static void handleAdmin() {
        String pin = readNonEmpty("Enter Admin PIN: ");
        if (!ADMIN_PIN.equals(pin)) {
            System.out.println("❌ Wrong PIN.");
            return;
        }
        while (true) {
            System.out.println("\n------ Admin Menu ------");
            System.out.println("1. Add Movie");
            System.out.println("2. Remove Movie (only if no tickets)");
            System.out.println("3. List Movies");
            System.out.println("4. Back");
            int ch = readInt("Choose option: ");
            switch (ch) {
                case 1 -> {
                    String name = readNonEmpty("Movie name: ");
                    int seats = readInt("Total seats: ");
                    Movie m = system.addMovie(name, seats);
                    System.out.println("✅ Added: " + m);
                }
                case 2 -> {
                    int id = readInt("Movie ID to remove: ");
                    boolean ok = system.removeMovie(id);
                    if (ok) System.out.println("🗑️ Movie removed.");
                    else System.out.println("❌ Cannot remove. Either movie not found or tickets exist.");
                }
                case 3 -> system.printMovies();
                case 4 -> { return; }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    // ====== INPUT HELPERS ======
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Value cannot be empty.");


        }
    }
}
