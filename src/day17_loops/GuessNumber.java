package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


/*
    create a program to guess the secret number.
    flow will be as follows:
    define the secret number, hard coded
    ask the user to guess a number
    based on the guess tell them a message:

        if they guess higher than the number:
          too high

        if they guess lower than the number:
          too low

        if they guess the number:
          you guessed correctly

          -> this will stop the guessing flow
 */

        Scanner key = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess;


        do {
            System.out.println("Please, guess the number");
            userGuess = key.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            } else {
                System.out.println("Guess correctly");
            }

        }
            while (userGuess !=secretNumber);


            /// Option 2

        System.out.println("Please, guess the number");
        userGuess = key.nextInt();


     while (userGuess !=secretNumber) {
         if (userGuess < secretNumber) {
             System.out.println("It is too low");
         } else if (userGuess > secretNumber) {
             System.out.println("It is too high");
         }
         System.out.println("Please, guess the number");
         userGuess = key.nextInt();

     }
        System.out.println("Guess correctly");









    }
}
