package day15_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a sentence");
        String sentence = key.nextLine();


        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length()-1));






    }
}
