package ComparableAndComparator;


import java.util.Comparator;

class Laptop implements Comparator<Laptop> {
    int prodectId;
    String  prodectName;
    int prodectQuality;
    String  prodecctBrands;
    int prodectPrice;
    public Laptop() {
    }

    public Laptop(int prodectId, String prodectName, int prodectQuality, String prodecctBrands, int prodectPrice) {
        this.prodectId = prodectId;
        this.prodectName = prodectName;
        this.prodectQuality = prodectQuality;
        this.prodecctBrands = prodecctBrands;
        this.prodectPrice = prodectPrice;
    }

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Laptop  [" +
                "prodectId=" + prodectId +
                ", prodectName='" + prodectName + '\'' +
                ", prodectQuality=" + prodectQuality +
                ", prodecctBrands=" + prodecctBrands +
                ", prodectPrice=" + prodectPrice +
                "]\n";
    }
}

