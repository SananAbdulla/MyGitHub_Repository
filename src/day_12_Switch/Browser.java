package day_12_Switch;
/*
   Ask user to enter a Browser type
 */


import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

Scanner key = new Scanner(System.in) ;
        System.out.println("Please enter a browser type");
        String browser =   key.nextLine();

        System.out.println("What is the webpage you want to navigate to: ");
        String webpage = key.next();

        // Opening $webpage in $browser

        switch (browser) {
            case "Chrome":
                System.out.println("Openning " + webpage + " in Chrome browser");
                break;
            case "Safari":
                System.out.println("Openning " + webpage + " in Safari browser");
                break;
            case "Mozilla":
                System.out.println("Openning " + webpage + " in Mozilla browser");
                break;
            case "Opera":
                System.out.println("Openning " + webpage + " in Opera browser");
                break;
            default:
                System.out.println("We do not have " + browser+ " intalled in our computer");



        }


    }
}
