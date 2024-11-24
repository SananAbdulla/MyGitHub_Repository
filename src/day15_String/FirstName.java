package day15_String;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {


/*
    first name
    last name

    fix to print proper name:
    capital first letter, te rest of the letter lowercase, no extra space

 */

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter the first name");
        String firstName = key.nextLine();


        System.out.println("Please, enter the last name");
        String lastName = key.nextLine();


        System.out.println("-------------------------");
        System.out.println("Your full name: " + firstName + lastName);


        // tomJERRY ---- > Tom Jerry
        /*
            first char fo first name ---- > UPPER
                rest char of first name --- > lower
            first chat of last name ----- > UPPER
                rest char of the last name --- > lower
         */

       String fortmattedFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String fortmattedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();




    }

}