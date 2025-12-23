package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ProdectTask {
   static Scanner scan=new Scanner(System.in);

    public static void mobles() {
        ArrayList mob = new ArrayList();

        mob.add(new Mobile(196, "PocoM3", 1, "Poco", 100000));
        mob.add(new Mobile(121, "PocoM3pro", 1, "Poco", 300500));
        mob.add(new Mobile(122, "PocoM44", 1, "Poco", 100000));
        mob.add(new Mobile(123, "PocoM65", 1, "Poco", 1300000));
        mob.add(new Mobile(124, "VivoY29", 1, "Vivo", 100000));
        mob.add(new Mobile(129, "VivoY24", 1, "Vivo", 300500));
        mob.add(new Mobile(128, "VivoY16", 1, "Vivo", 100000));
        mob.add(new Mobile(135, "VivoY13pro", 1, "Vivo", 300500));
        mob.add(new Mobile(165, "IPhone66pro", 1, "Apple", 1300000));
        mob.add(new Mobile(125, "IPhone17", 1, "Apple", 100000));
        mob.add(new Mobile(166, "IPhone55", 1, "Apple", 1300000));
String choice;
        while(true) {
            System.out.println("""
                   
                    *** Sort By
                    A. Sort By product Id ascending order
                    B. Sort By product Id descending order
                    C. Sort By product Name ascending order
                    D. Sort By product Name descending order
                    E. Sort By product Brad ascending order
                    F. Sort By product Brad descending order
                    G. Sort By product Prise ascending order
                    H. Sort By product Prise descending order
                    I. Go to main menu...
                    *** Enter your  Choice
                    """);
            choice = scan.nextLine();
            switch (choice) {
                case "A":
                    System.out.println("Befor sort :\n"+ mob);
                    Collections.sort(mob,new ProdectSortByIdAsend());
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "B":
                    System.out.println("Before sort :\n"+ mob);
                    Collections.sort(mob,new ProdectSortByIdDsend());
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "C":
                    System.out.println("Before sort :\n"+ mob);
                    Comparator <Mobile> m31=(m1,m2)->m1.prodectName.compareTo(m2.prodectName);
                    Collections.sort(mob,m31);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "D":
                    System.out.println("Before sort :\n"+ mob);
                    Collections.sort(mob,new ProdectSortByIdDsend());
                    Comparator <Mobile> m32=(m1,m2)->m2.prodectName.compareTo(m1.prodectName);
                    Collections.sort(mob,m32);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "E":
                    System.out.println("Before sort :\n"+ mob);
                    Comparator <Mobile> m41=(m1,m2)->m1.prodecctBrands.compareTo(m2.prodecctBrands);
                    Collections.sort(mob,m41);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "F":
                    System.out.println("Before sort :\n"+ mob);
                    Comparator <Mobile> m42=(m1,m2)->m2.prodecctBrands.compareTo(m1.prodecctBrands);
                    Collections.sort(mob,m42);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "G":
                    System.out.println("Before sort :\n"+ mob);
                    Comparator <Mobile> m51=(m1,m2)->m1.prodectPrice-m2.prodectPrice;
                    Collections.sort(mob,m51);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "H":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Mobile> m52=(m1,m2)->m2.prodectPrice-m1.prodectPrice;
                    Collections.sort(mob,m52);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "I":
                    return;
                default:
                    System.exit(0);
                    break;
            }
        }

    }


    public static void laptop() {
        ArrayList mob = new ArrayList();

        mob.add(new Laptop(196, "LenovoM3", 1, "Lenovo", 100000));
        mob.add(new Laptop(121, "LenovoM3pro", 1, "Lenovo", 300500));
        mob.add(new Laptop(122, "LenovoM44", 1, "Lenovo", 100000));
        mob.add(new Laptop(123, "LenovoM65", 1, "Lenovo", 1300000));
        mob.add(new Laptop(124, "HPY29", 1, "HP", 100000));
        mob.add(new Laptop(129, "HPY24", 1, "HP", 300500));
        mob.add(new Laptop(128, "HPY16", 1, "HP", 100000));
        mob.add(new Laptop(135, "HPY13pro", 1, "HP", 300500));
        mob.add(new Laptop(165, "ILab66pro", 1, "Apple", 1300000));
        mob.add(new Laptop(125, "ILab17", 1, "Apple", 100000));
        mob.add(new Laptop(166, "ILab55", 1, "Apple", 1300000));
        String choice;
        while(true) {
            System.out.println("""
                   
                    *** Sort By
                    1. Sort By product Id ascending order
                    2. Sort By product Id descending order
                    3. Sort By product Name ascending order
                    4. Sort By product Name descending order
                    5. Sort By product Brad ascending order
                    6. Sort By product Brad descending order
                    7. Sort By product Prise ascending order
                    8. Sort By product Prise descending order
                    9. Go to main menu...
                    *** Enter your  Choice
                    """);
            choice = scan.nextLine();
            switch (choice) {
                case "A":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m11=(m1,m2)->m1.prodectPrice-m2.prodectPrice;
                    Collections.sort(mob,m11);
                    System.out.println("\nAfter sort :\n"+mob);
                case "B":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m12=(m1,m2)->m2.prodectPrice-m1.prodectPrice;
                    Collections.sort(mob,m12);
                    System.out.println("\nAfter sort :\n"+mob);
                case "C":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m31=(m1,m2)->m1.prodectName.compareTo(m2.prodectName);
                    Collections.sort(mob,m31);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "D":
                    System.out.println("Befor sort :\n"+ mob);
                    Collections.sort(mob,new ProdectSortByIdDsend());
                    Comparator <Laptop> m32=(m1,m2)->m2.prodectName.compareTo(m1.prodectName);
                    Collections.sort(mob,m32);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "E":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m41=(m1,m2)->m1.prodecctBrands.compareTo(m2.prodecctBrands);
                    Collections.sort(mob,m41);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "F":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m42=(m1,m2)->m2.prodecctBrands.compareTo(m1.prodecctBrands);
                    Collections.sort(mob,m42);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "G":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m51=(m1,m2)->m1.prodectPrice-m2.prodectPrice;
                    Collections.sort(mob,m51);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "H":
                    System.out.println("Befor sort :\n"+ mob);
                    Comparator <Laptop> m52=(m1,m2)->m2.prodectPrice-m1.prodectPrice;
                    Collections.sort(mob,m52);
                    System.out.println("\nAfter sort :\n"+mob);
                    break;
                case "I":
                    return;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        while(true) {
            System.out.println("""
                    ===  Wecome to Kolaru Prodects  ====
                    
                    *** Choice your prodect
                    1. Mobile
                    2. Laptop
                    3. Exit
                    *** Enter your  Choice
                    """);
            choice=scan.nextInt();
            switch (choice){
                case 1:
                mobles();
                break;
                case 2:
                laptop();
                break;
                case 3:
                    System.exit(0);
                break;
            }

        }


    }
}
