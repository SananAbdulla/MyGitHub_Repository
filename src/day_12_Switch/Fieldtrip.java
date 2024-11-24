package day_12_Switch;

import java.util.Scanner;

public class Fieldtrip {
    public static void main(String[] args) {


        /* have tree variable
        - grade
        - location
        - number of groups

        Based on the grade make a decision where the location is going to be
        and what the number of groups will be who the teacher will be

         */

      int grade;
      String teacher;
      String location;
      int numOfGroups;

     Scanner key = new Scanner(System.in);
        System.out.println("What is the grade you want to get a field trip info: ");
        grade =key.nextInt();

        // Grade from 1 to 6 -----> Mr. Nadir | Apple Orchard | 3
        // All the other grades ---> Mr. benjamin | Fire Works | 10

        if (grade >= 1 && grade <=6) {

            if (grade == 1) {
                teacher = "Ms. Jessica";
                location = "Zoo";
                numOfGroups = 4;
            }
           else if (grade == 2) {
                teacher = "Ms. Casey";
                location = "Movie Theater";
                numOfGroups = 3;
            }
            else if (grade == 3) {
                teacher = "Mr. Tom";
                location = "Museum";
                numOfGroups = 7;
            }
             else if (grade == 4) {
                teacher = "Mr. Jerry";
                location = "Aquarium";
                numOfGroups = 9;
            }
               else if (grade == 5) {
                teacher = "Ms. Winnie";
                location = "Disney";
                numOfGroups = 2;
            }
                else  {
                teacher = "Ms. Poo";
                location ="Concert";
                numOfGroups = 3;
             }
//            teacher = "Mr. Nadir";
//            location= "Apple Orchard";
//            numOfGroups= 3;


        }else {
            teacher = "Mr. Benjamin";
            location ="Fire works";
            numOfGroups = 10;
        }
        System.out.println("\tHere is field trip info for grade: " + grade);
        System.out.println("\tTeacher name: " + teacher);
        System.out.println("\tThis is the location you will be: "+ location);
        System.out.println("\tThe number of group: " + numOfGroups);



    }
}
