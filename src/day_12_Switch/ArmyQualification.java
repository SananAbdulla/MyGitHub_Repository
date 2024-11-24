package day_12_Switch;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {

        /*
Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

    - The person must be a citizen or a resident
        -> If not print: You must be a citizen or a resident
    - Their age must be between 18 and 35  //----- > 18 <= age <= 35
        -> If not print: Your age must be between 18 to 35 years old
    - They must have a high school diploma
        -> If not print: You must have a high school diploma

    > If all the criteria is met print: You are qualified for the Army
 */


        boolean isCitizen, isResident;
        boolean hasDiploma;

        int age;

        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to army station");
        System.out.println("Please, answer the following questions to check eligibilty \n");
        System.out.println("\tAre you citizen(true/false): ");
        isCitizen = scan.nextBoolean();
        System.out.println("\tAre you a resident(true/false): ");
        isResident = scan.nextBoolean();
        System.out.println("\tDo you have a high degree Diploma(true/false): ");
        hasDiploma = scan.nextBoolean();
        System.out.println("\tHow old are you ");
        age = scan.nextInt();

        if ((isCitizen || isResident) && hasDiploma && 18<= age && age <= 35 ) {
            System.out.println("You are eligible");
        }

        else {
            System.out.println("\n\tYour are not eligible for the following reasons");

            if (!isCitizen || !isResident) {
                System.out.println("\t\tYou must be a citizen or resident and must have diploma");
            }
            if (!hasDiploma) {
                System.out.println("\t\tYou must have a high school diploma");
            }
            if (age < 18 || age > 35) {
                System.out.println("\t\tYour age must be between 18 to 35 years old");
            }

        }








    }
}
