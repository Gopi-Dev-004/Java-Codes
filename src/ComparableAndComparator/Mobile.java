package ComparableAndComparator;

import java.util.Comparator;
class ProdectSortByIdAsend implements Comparator<Mobile> {
    public int compare(Mobile o1, Mobile o2) {
        return o1.prodectId - o2.prodectId;
    }
}
    class ProdectSortByIdDsend implements Comparator<Mobile>{
        public int compare(Mobile o1, Mobile o2) {
            if(o1.prodectId<o2.prodectId){
                return 1;
            }else if (o1.prodectId>o2.prodectId) {
                return -1;
            }
            return 0;
        }
}
public class Mobile implements Comparator<Mobile> {
    int prodectId;
    String  prodectName;
    int prodectQuality;
    String prodecctBrands;
    int prodectPrice;

    public Mobile() {
    }

    public Mobile(int prodectId, String prodectName, int prodectQuality, String prodecctBrands, int prodectPrice) {
        this.prodectId = prodectId;
        this.prodectName = prodectName;
        this.prodectQuality = prodectQuality;
        this.prodecctBrands = prodecctBrands;
        this.prodectPrice = prodectPrice;
    }



    @Override
    public int compare(Mobile o1, Mobile o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Mobile  [" +
                "prodectId=" + prodectId +
                ", prodectName='" + prodectName + '\'' +
                ", prodectQuality=" + prodectQuality +
                ", prodecctBrands=" + prodecctBrands +
                ", prodectPrice=" + prodectPrice +
                "]\n";
    }
}



