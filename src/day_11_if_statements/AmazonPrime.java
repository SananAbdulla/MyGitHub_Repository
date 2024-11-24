package day_11_if_statements;

import java.util.Scanner;

public class AmazonPrime {
    public static void main(String[] args) {

        /*
Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99



            if prime
                do this
            else
                if
                    do
                else
                    do

 */

        double price;
        boolean hasPrime = false;

                Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price");
        price = scan.nextDouble();


        if (hasPrime) {
            System.out.println("You are eligible for 2 day shipping");
        }
        else if (!hasPrime && price >= 25) {
            System.out.println("You are eligible for regular shipping");
        }
        else   {
            System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
        }
        System.out.println("Price: " + price);


    }
}
