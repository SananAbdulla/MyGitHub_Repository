package day35_inheritence.recap;

public class PizzaStore {
    public static void main(String[] args) {

        // TODO look
        Pizza pizza1 = new Pizza("Large", 5);
        // pizza1.size = "Big"; // Since encapsulation applied, cannot access directly.
        // pizza1.numOfToppings = -4;
        pizza1.setSize("Very Big");
        System.out.println(pizza1);

       // 1 option to call total price but you dont have to include calculate method to toSting
       // System.out.println("Total price " + pizza1.calculatePrice());


        Pizza pizza2 = new Pizza("small", 2);
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza("medium", 3);
        System.out.println(pizza3);


    }
}
