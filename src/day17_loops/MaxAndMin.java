package day17_loops;


import java.util.Scanner;
public class MaxAndMin {
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


        Scanner key = new Scanner(System.in);
        System.out.println("Hey, How many number do you want to compare?");
        int countOfNumber = key.nextInt();

        int cycle = 1;
        int userNum ;

        //int biggest = -21489668;
        //int smallest = 21489668;

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;



        while (cycle <= countOfNumber ) {
            System.out.println("Please, enter the number: " + cycle);
            userNum = key.nextInt();

            if (userNum > biggest) {
                biggest = userNum;
            }
            if (userNum< smallest) {
                smallest = userNum;
            }

            cycle++;
        }
        System.out.println("Biggest number is: " + biggest);
        System.out.println("Smallest number is: " + smallest);


    //TODO practice this





    }
}
