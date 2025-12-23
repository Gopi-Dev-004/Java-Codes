//package com.ticketbooking.util;
//
//public class SeatLayout {
//    private  static int dim =10;
//    private static char[][] seats = new char[dim][dim];
//
//    static {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                seats[i][j] = ' ';
//            }
//        }
//    }
//
//    public static void viewSeats() {
//        System.out.println("\n=============== Seat Layout ===============");
//
//        System.out.println("..............Screen View...............\n");
//
//        System.out.print("  ");
//        for(int i = 1; i <= dim; i++) System.out.printf("  %02d", i );
//        System.out.println();
//        System.out.print("   \u250C");
//        for(int first = 0; first < dim - 1; first++) {
//            System.out.print("\u2500\u2500\u2500\u252C");
//        }
//        System.out.print("\u2500\u2500\u2500\u2510\n");
//
//        for (int i = 0; i < dim; i++) {
//
//            System.out.printf(" %c ", (char)(i+65));
//
//            System.out.print("\u2502");
//            for (int j = 0; j < dim; j++) {
//                System.out.print(" " + (seats[i][j]) + " ");
//                System.out.print("\u2502");
//            }
//            System.out.println();
//
//            if (i != dim - 1) {
//                System.out.print("   \u251C");
//                for (int mid = 0; mid < dim - 1; mid++) {
//                    System.out.print("\u2500\u2500\u2500\u253C");
//                }
//                System.out.print("\u2500\u2500\u2500\u2524\n");
//            }
//            else {
//                System.out.print("   \u2514");
//                for(int last = 0; last < dim - 1; last++) {
//                    System.out.print("\u2500\u2500\u2500\u2534");
//                }
//                System.out.print("\u2500\u2500\u2500\u2518");
//            }
//        }
//        System.out.println();
//    }
//
//
//    public static boolean bookSeat(char row, int col) {
//        int rowIndex = row - 'A';
//        int colIndex = col - 1;
//
//        if (rowIndex < 0 || rowIndex >= 10 || colIndex < 0 || colIndex >= 10)
//            return false;
//
//        if (seats[rowIndex][colIndex] == ' ') {
//            seats[rowIndex][colIndex] = 'X';
//            return true;
//        }
//        return false;
//    }
//}