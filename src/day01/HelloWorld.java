package day01;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name");
            name = scanner.nextLine();

        }

        System.out.println("Hello " + name);


        // TODO:i need to find how much i spent on computer
        System.out.println(" // I recently bought a computer/");




    }


}
