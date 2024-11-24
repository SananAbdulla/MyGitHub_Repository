package day9_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

      /*
      Write a program that aks the use to enter
      a price
      and quantity

      then calculate the revenue. revenue = price * quantity

       */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a price of the item");
//        double itemPrice= scanner.nextDouble();
//
//        System.out.println("enter a quatity of the item");
//        int itemQuantity = scanner.nextInt();
//
//       double revenue = itemPrice * itemQuantity;
//        System.out.println("The revenue here is: " + revenue);


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a numbers");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        double num3= scanner.nextDouble();

        //double total = num1+num2+num3;

//       boolean isTriAngle = total == 180;
//       boolean isCircle = total == 360;

        boolean isTriAngle = (num1+num2+num3) == 180;

        System.out.println("it is triangle: "+ isTriAngle);
        //System.out.println("it is circle: "+ isCircle);





    }
}
