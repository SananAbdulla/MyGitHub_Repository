package day_11_if_statements;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class If_Statement_Practice {


    public static void main(String[] args) {

        //int age;
//        Scanner key = new Scanner(System.in);
//
//        System.out.println("How old are u");
//        int age = key.nextInt();
//
//        if (18 <= age && age <=35) {
//
//            System.out.println("You are young boy");
//        }
//        else if (35< age && age <=60) {
//            System.out.println("you are old");
//        }
//
//        else
//            System.out.println("you died");


//        Random key = new Random();
//
//        int age = key.nextInt(500)+1;
//
//        if (18 <= age && age <=35) {
//
//            System.out.println("You are young boy");
//        }
//        else if (35< age && age <=60) {
//            System.out.println("you are old");
//        }
//
//        else
//            System.out.println("you died");
//            System.out.println("Random was: " + age);



//        int age = 40;
//        int result;
//
//        if (age > 50) {
//            System.out.println("Ture");
//        }
//        else {
//            System.out.println("wrong");
//        }
////


        //int myNumber = 40;
         //myNumber % 2 == 0;
         String result;


        Random random = new Random();
        int myNumber = random.nextInt(100)+1;
//
//
        if (myNumber % 2 == 0) {
            result = "Even number " + myNumber;
        }
        else {
            result = "odd number " + myNumber;
        }

        System.out.println(result);

//        result = (myNumber % 2 == 0) ? "Even number" : "Odd number";
//
//        System.out.println(result + " " + "Random number is: "+myNumber);

        ArrayList<String> food = new ArrayList<String>();

    }
}
