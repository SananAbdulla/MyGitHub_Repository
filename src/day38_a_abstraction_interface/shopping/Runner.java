package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {


       /*
        // abstract class cannot be instantiated, no object can be created
        Shopping s = new Shopping();
        OnlineShopping os = new OnlineShopping();

        // Interface  cannot be instantiated, no object can be created
         Shipping sh = new Shipping();
        */

        Target targ = new Target();
        targ.buyItem();
        targ.returnItem();
        targ.price = 77;
        System.out.println(targ.price);


        Amazon az = new Amazon();
        System.out.println(Amazon.COUNTRY);
    }
}
