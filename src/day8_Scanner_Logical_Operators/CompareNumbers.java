package day8_Scanner_Logical_Operators;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in) ;
        System.out.print("Enter 2 numbers");

        System.out.println("\n1st number is: ");
        int num1 = scan.nextInt();

        System.out.println("\t2nd number is: ");
        int num2 = scan.nextInt();

        boolean areNumsEqual = num1==num2;

        System.out.println("Are numbers equal? " +areNumsEqual);

    }

}
