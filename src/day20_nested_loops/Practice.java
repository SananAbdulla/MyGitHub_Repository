package day20_nested_loops;

import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {

//        System.out.println("Prime numbers between 1 and 20 are:");
//
//        for (int num = 2; num <= 20; num++) { // Start from 2, as 1 is not a prime number
//            boolean isPrime = true;
//
//            for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to the square root of the number
//                if (num % i == 0) { // If divisible, it's not a prime
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(num + " ");
//            }
//        }



//        Scanner key = new Scanner(System.in);
//        System.out.println("Please enter numbers");

//        int userNumber = key.nextInt();
//
//
//        for (int i = 1; i <=userNumber ; i++) {
//            int count = 0;
//
//            for (int j = 01; j <=i ; j++) {
//                if (i % j ==0) {
//                    count++;
//                }
//
//            }
//            if (count ==2) {
//                System.out.println(i + " ");
//            }
//        }


//        int num = 1;
//
//        if (num >0) {
//            System.out.println("positive");
//        }
//        else if (num !=0) {
//            System.out.println("negative");
//        }else {
//            System.out.println("sero");
//        }


//        int num = 444444442;
//        int x = (num >10) ? num++: num--;
//
//        System.out.println(x);
//        System.out.println(x+1);

        Scanner key = new Scanner(System.in);


//        int n = key.nextInt();
//
//        while (n < 1 || n > 10 ) {
//            System.out.println(n + " is not between range");
//            n = key.nextInt();
//        }
//        System.out.println(n + " is between range");

//        for ( ; ;) {   //infinite loop
//            System.out.println("hello");
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(i + "" + j );
//
//            }
//            System.out.println();
//
//        }


        for (int i = 0; i <=20 ; i++) {
            int count;

            if (i % 2 == 0) {
                continue;

            } else {
                System.out.println(i);
            }

        }



    }

}
