package day17_loops;

import java.util.Scanner;

public class while_Loop_practice {
    public static void main(String[] args) {

/// OPTION 1
//        Scanner key = new Scanner(System.in);
//
//        int secret_Number = 555;
//        int guessNumber;
//
//
//        do {
//            System.out.println("Please enter your guess numbers");
//            guessNumber = key.nextInt();
//
//            if (guessNumber < secret_Number) {
//                System.out.println("It is to loow number");
//            } else if (guessNumber > secret_Number) {
//                System.out.println("It is too high number");
//            } else {
//                System.out.println("You guessed the number correctly");
//            }
//
//        }
//        while (guessNumber != secret_Number);


        // OPTION 2
//        Scanner key = new Scanner(System.in);
//        int secretNumber = 777; // The number to guess
//        int userGuess; // User's guess
//
//        System.out.println("Enter the maximum number of attempts:");
//        int maxAttempts = key.nextInt(); // Input the maximum number of attempts
//
//        int attempts = 0; // Track the number of attempts
//
//        System.out.println("Please, guess the number:");
//
//        while (attempts < maxAttempts) {
//            userGuess = key.nextInt(); // User's guess input
//            attempts++; // Increment the attempt counter
//
//            if (userGuess == secretNumber) {
//                System.out.println("Congratulations! You guessed correctly.");
//                return; // Exit the program when the guess is correct
//            } else if (userGuess < secretNumber) {
//                System.out.println("It is too low");
//            } else {
//                System.out.println("It is too high");
//            }
//
//            if (attempts < maxAttempts) {
//                System.out.println("Try again:");
//            }
//        }
//
//        System.out.println("You've used all your attempts. You failed to guess the number.");


        // OPTION 3

        Scanner key = new Scanner(System.in);
        int secretNumber = 777; // The number to guess
        int userGuess; // User's guess
        int attempts = 0; // Counter for the number of attempts

        do {
            System.out.println("Please, guess the number:");
            userGuess = key.nextInt();
            attempts++; // Increment the attempt counter

            if (userGuess < secretNumber) {
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            } else {
                System.out.println("Guess correctly!");
                System.out.println("You found the secret number in " + attempts + " attempt(s).");
            }
        } while (userGuess != secretNumber);

    }
}
