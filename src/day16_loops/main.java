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

//          int n = 1;
//          do {
//              System.out.println("DO WHILE LOOP: " + n);
//              n+=2;
//          }
//          while (n<=20);
//
//        System.out.println("---------------------");
//          // WHILE LOOP
//
//        int m = 1;
//
//        while (m<=20) {
//
//            System.out.println("DO WHILE LOOP: " + m);
//            m+=2;
//        }


        // for loop

//        Scanner key = new Scanner(System.in);
//
//        System.out.println("Pls enter number");
//        int num = key.nextInt();
//
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(num +" x " + i + " = " + (num*i));

    //    }

    //String str= "Azerbaijan";
        Scanner key= new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String userInput = key.next();

        String reversed = "";

//
//        for (int i = 0; i < userInput.length(); i++) {
//            System.out.println(userInput.charAt(i));
//
//        }
        System.out.println("------------------------------");

        for (int i = userInput.length()-1; i >= 0; i--) {
            //System.out.println(userInput.charAt(i));
            reversed += userInput.charAt(i);
        }
        System.out.print(reversed);
        


    }

}