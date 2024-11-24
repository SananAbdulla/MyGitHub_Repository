package day16_loops;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // finding MAx and Min number

//
//        Scanner key = new Scanner(System.in);
//        System.out.println("Hey, How many number do you want to compare?");
//        int countOfNumber = key.nextInt();
//
//
//        int cycle =1;
//        int userNum;
//
//        int biggest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//
//        while (cycle <=countOfNumber) {
//            System.out.println("Please enter your number: " + cycle);
//            userNum = key.nextInt();
//
//            if (userNum > biggest) {
//                biggest = userNum ;
//            }
//            if (userNum < smallest) {
//                smallest = userNum;
//            }
//            cycle++;
//        }
//
//        System.out.println("Biggest number is: " + biggest);
//        System.out.println("Smallest number is: " + smallest);


       // Do While loop

          int n = 1;
          do {
              System.out.println("DO WHILE LOOP: " + n);
              n+=2;
          }
          while (n<=20);

        System.out.println("---------------------");
          // WHILE LOOP

        int m = 1;

        while (m<=20) {

            System.out.println("DO WHILE LOOP: " + m);
            m+=2;
        }




    }

}