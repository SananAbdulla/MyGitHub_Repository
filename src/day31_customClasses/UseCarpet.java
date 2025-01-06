package day31_customClasses;

// Runner class - main method
public class UseCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(4.5, 10.5, 99.90, true);
        Carpet carpet2 = new Carpet(6, 15, 150, false );

        System.out.println(carpet1);
       // carpet1.calculateTotalPrice();

        System.out.println();
        System.out.println(carpet1);
        carpet2.calculateTotalPrice();

        System.out.println();
       // Carpet carpet2 = new Carpet(10, 20, 2.5, false);
        System.out.println(carpet2);
        System.out.println();


    }
}
