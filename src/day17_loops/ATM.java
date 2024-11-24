package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);


        int validPin = 777;
        int userEnteredPin;
        int userAttemptCount = 0;

        System.out.println("\t\tPlease enter your card to the ATM");

        do {
            System.out.println("\tPlease, enter pin");
            userEnteredPin = key.nextInt();
            userAttemptCount++;
            if (userEnteredPin == validPin) {
                System.out.println("Success");
                System.out.println("You entered valid Pin in " + userAttemptCount + " attempts");
            }
        }while (userEnteredPin!=validPin && userAttemptCount<=5);

        if (userAttemptCount >5 && userEnteredPin !=validPin) {
            System.out.println("You are locked");
        }



    }
}
