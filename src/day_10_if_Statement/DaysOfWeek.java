package day_10_if_Statement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

 /*
     Declare and assign a number (day)

     1- Monday
     2- Tuesday

     6 - Saturday
     7 - Sunday

     Ex: 2
         Tuesday

         // website: www.google.com


  */

        Scanner key = new Scanner(System.in);

        System.out.println("Start");
        System.out.println("Please, enter a number between 1 - 7 inclusive: ");
        int weekDayInNum= key.nextInt();

        boolean isMonday = weekDayInNum==1;
        boolean isTuesday = weekDayInNum==2;
        boolean isWednesday = weekDayInNum ==3;

        if (isMonday) {
            System.out.println("Monday");
        }
        else if (isTuesday) {
            System.out.println("Tuesday");
        }
         if (isWednesday)
            System.out.println("Wednesday");

         if (weekDayInNum== 4) {
            System.out.println("Thursday");

        }







    }
}
