package day_12_Switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {


/*
 Given a day number, find and print the day related to the number

 1 - Monday
 2 - Tuesday

 6 - Saturday
 7 - Sunday



 */

 //int numofWeek = 2;

        Scanner key = new Scanner(System.in);
        System.out.println("Write numbers related days of week");
        int numofWeek = key.nextInt();
        key.close();
        String day;

     // Option 1.
//  switch (numofWeek) {
//      case 1:
//          System.out.println("Monday");
//          break;
//      case 2:
//          System.out.println("Tuesday");
//          break;
//      case 6:
//          System.out.println("Saturday");
//          break;
//      case 7:
//          System.out.println("Sunaday");
//          break;
//      default:
//          System.out.println("No number found related to weeks");
//
//  }
        // Option 2

        switch (numofWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day ="No number found related to weeks";

        }
        System.out.println(day);
    }
}
