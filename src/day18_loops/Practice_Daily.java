package day18_loops;

import java.util.Scanner;

public class Practice_Daily {

    public static void main(String[] args) {


/*     finding last letter of the word

        String word = "Azerbaijan";

        System.out.println(word.charAt(word.length()-2));
*/


        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter input: ");
        String userInput = key.nextLine().replaceAll(" ", "_");


        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(userInput.charAt(i));
            if (i == userInput.length()-1) {
                break;
            }
            System.out.print(" ");

        }





    }


}
