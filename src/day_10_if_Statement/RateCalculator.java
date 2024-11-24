package day_10_if_Statement;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        double salary;
        int hoursPerWeek;
        double hourlyRate;


        System.out.println("Please enter your annual salary");
        salary = scan.nextDouble();

        System.out.println("How many hours he/she works in a week: ");
        hoursPerWeek = scan.nextInt();

        hourlyRate = salary/(hoursPerWeek * 52);

        System.out.println("My annual salary is: " + salary + "\n\tWork hours per week: " + hoursPerWeek +"\n\tHourly Rate" + hourlyRate);









    }
}
