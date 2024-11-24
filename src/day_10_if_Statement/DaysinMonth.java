package day_10_if_Statement;

import java.util.Scanner;

public class DaysinMonth {
    public static void main(String[] args) {

   /*  create a int variable to represent the month number. Where 1 is January and 12 is
       December. Use the month number input to determine how many days are in that month
       use following data to help you determine the number of days in each month

       Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
       Months that has 30 days: 4, 6, 9, 11
       Month that has 28 days: 2

       Ex:
              12
              31 days

       Ex:    9
              31 days


    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number between 1 and 12 inclusuive which represents each month: ");
        int monthInNum = scanner.nextInt();

        if (monthInNum == 1 ||monthInNum == 3 || monthInNum == 5 || monthInNum == 7 || monthInNum == 8 || monthInNum == 10 || monthInNum == 12) {
            System.out.println("Month has 31 days");
        }
        else if (monthInNum == 4 || monthInNum == 6 || monthInNum == 9 || monthInNum == 11) {

            System.out.println("Month has 30 days");

        }
        else if (monthInNum == 2) {
                   System.out.println("Month has 28 days");
    }
        else {
                   System.out.println("are u kidding me?!");

    }












    }
}
