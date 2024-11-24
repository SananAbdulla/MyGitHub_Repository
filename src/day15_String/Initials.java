package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

     /*
        Ask the user to enter their first name
        Ask the user to enter their last name
        Print the initials as uppercase letter

      */

        Scanner key = new Scanner (System.in);
        System.out.println("Please enter your first name");
        String firstName = key.nextLine().toUpperCase();

        System.out.println("Please enter your last name");
        String lastName = key.nextLine().toUpperCase();

        System.out.println(firstName.charAt(0) +"." +lastName.charAt(0));

//        char init = firstName.charAt(0);
//
//        System.out.println(init);





    }

}
