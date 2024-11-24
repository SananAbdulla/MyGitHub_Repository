package day17_loops;

import java.util.Random;
import java.util.Scanner;

public class Daily_Practice {
    public static void main(String[] args) {


        /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.


    2
    Ask a user:
    Tell if it is biggest or smallest.

    3
    Ask a user:
    Tell if it is biggest or smallest.

         */

//
//        Scanner key = new Scanner(System.in);
//
//        System.out.println("How many numbers do u wanna to compare");
//        int countOfNumbers = key.nextInt();
//
//
//        int biggest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//        int cycle = 1;
//        int userEnteredNum;
//
//        while (cycle <= countOfNumbers) {
//            System.out.println("Please, enter your number: " + cycle);
//            userEnteredNum = key.nextInt();
//
//
//            if (userEnteredNum > biggest) {
//                biggest = userEnteredNum;
//            }
//            if (userEnteredNum < smallest) {
//                smallest = userEnteredNum;
//            }
//
//            cycle++;
//
//
//
//        }
//
//        System.out.println("The biggest number is: " + biggest);
//        System.out.println("The smallest number is: " + smallest);



        // TASK 2

        /*
           lets says we have certain 4 times attempt
           find here biggest and smallest numbers
           show also iterations

         */


//        Scanner key = new Scanner(System.in);
//
//        int count = 1;
//        int userEnteredNumber;
//
//        int biggest = Integer.MIN_VALUE;
//        int smallesst = Integer.MAX_VALUE;
//
//        while (count <=4) {
//            System.out.println("Please enter your numbers: " + count);
//            userEnteredNumber = key.nextInt();
//
//            if (userEnteredNumber>biggest) {
//                biggest = userEnteredNumber;
//            }
//            if (userEnteredNumber < smallesst) {
//                smallesst = userEnteredNumber;
//            }
//            count++;
//
//        }
//
//        System.out.println("The biggest number is : " + biggest);
//        System.out.println("The smallest number is : " + smallesst);




        // TASK ATM again

//        Scanner key = new Scanner(System.in);
//
//        int validPin = 555;
//        int userEnteredPin;
//        int userAttemptCount = 0;

//        System.out.println("Hello, please insert your card to the ATM machine");
//
//
//
//        do {
//            System.out.println("\t\tPlease enter PIN code and hit the ENTER button ");
//            userEnteredPin = key.nextInt();
//            userAttemptCount++;
//
//            if (userEnteredPin == validPin) {
//                System.out.println("Success, you entered your PIN in " + userAttemptCount + " attempt");
//            }
//            else if (userAttemptCount < 5) {
//                System.out.println("You entered wrong PIN! Try again");
//            }
//
//        }
//            while (userEnteredPin != validPin && userAttemptCount <5 );
//        if (userAttemptCount == 5 && userEnteredPin != validPin) {
//            System.out.println("You are locked!");
//            }


              // TASK ATM using While loop

//
//        Scanner key = new Scanner(System.in);
//
//        int validPin = 555;
//        int userEnteredPin = 0;
//        int userAttemptCount = 0;
//
//        System.out.println("Hello, please insert your card to the ATM machine");
//
//
//        while (userEnteredPin != validPin && userAttemptCount < 5) {
//            System.out.println("\t\tPlease enter PIN code and hit the ENTER button ");
//            userEnteredPin = key.nextInt();
//            userAttemptCount++;
//
//            if (userEnteredPin == validPin) {
//                System.out.println("Success, you entered your PIN in " + userAttemptCount + " attempt");
//            } else if (userAttemptCount < 5) {
//                System.out.println("You entered wrong PIN! Try again");
//
//            }
//
//        }
//        if (userAttemptCount ==5 && userEnteredPin != validPin) {
//            System.out.println("You are locked");
//        }

        // TASK from chatGpt

        /*
              Generate a random number between 1 and 20.
              Use a while loop to let the user guess the number.
              Stop the loop when the user guesses correctly.

         */

//        Random key = new Random();
//        int randomNum = key.nextInt(5) + 1; // Random number between 1 and 5
//        Scanner scanner = new Scanner(System.in);
//
//        int userGuessNum;
//
//        System.out.println("Guess the number between 1 and 5!");
//
//        do {
//            System.out.print("Enter your guess: ");
//            userGuessNum = scanner.nextInt();
//
//            if (userGuessNum != randomNum) {
//                System.out.println("You failed, try again!");
//            } else {
//                System.out.println("You found it! The random number was: " + randomNum);
//            }
//        } while (userGuessNum != randomNum);
//
//        scanner.close();

          // OPTION 2

        Random key = new Random();
        int randomNum = key.nextInt(2) + 1; // Random number between 1 and 5
        int userGuessNum = 3; // Predefined guess number

        System.out.println("Random number is: " + randomNum);

        // While loop to keep guessing until the number is found
        while (userGuessNum != randomNum) {
            System.out.println("You failed, try again!");
            userGuessNum = 4; // Keep the predefined guess value
        }

        // If the number is found
        System.out.println("You found it! The random number was: " + randomNum);



    }
}