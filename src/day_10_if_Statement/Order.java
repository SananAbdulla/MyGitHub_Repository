package day_10_if_Statement;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {


        /* - Place an order
             Ask the user enter the product name ( String, multiple words)
             Ask the user to enter the price (double)
             Ask the user to enter the quantity (int)
             Ask the user to enter their full name (String, multiple word)
             Print int he following format
             "$fullName, your order for $quantity $productName has been placed.
              Your Total is $totalCost(price * quantity)."

              Ex:
              Input: "Apples, 1.5, 5. "Luke"
              Output: Luke, your order for 5 Apples has been placed. Your
              total is 7.5

         */

       //  Object Reference  = object (parameters)
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter product name: ");
        String productName = key.nextLine();

        System.out.println("Please, enter price: ");
        double price = key.nextDouble();

        System.out.println("Please, enter the quantity: ");
        int quantity = key.nextInt();
        key.nextLine();

        System.out.println("Please, your full name: ");
        String fullName = key.nextLine();



        String orderDetails = fullName+ ",your order for " + quantity +" "+ productName+ " has been placed. " +
                "Your Total is: " + (price * quantity);

        System.out.println(orderDetails);















    }
}
