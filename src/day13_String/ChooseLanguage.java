package day13_String;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {


/*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan

    based on the number they picked print a message:

        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
 */
        Scanner key = new Scanner(System.in);
        System.out.println("Please choose one of the options below:");
        System.out.println("\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan\n\n\tYour Option: ");

       int userOption= key.nextInt();
       //String message = "";

       // Option 1 - With else if

//        if (userOption==1) {
//            message = "hello, thanks for your call";
//        }else if (userOption==2) {
//            message = "hola, gracias para llamar";
//        }
//        else if (userOption==3) {
//            message = "merhaba, aradiginiz icin tesekkurler";
//        }
//        else if (userOption==4) {
//            message = "privet, spasibo za vash zvonok";
//        }
//        else if (userOption==5) {
//            message = "Merci ,pour votre appel";
//        }
//        else if  (userOption==6) {
//            message = "salam, zeng ettiginiz ucun mennatdariq";
//        }
//        else {
//            System.out.println("no valid number");
//        }
//
//            System.out.println(message);


        //Option 2. using Switch

//        switch (userOption) {
//            case 1:
//                System.out.println("hello, thanks for your call");
//                break;
//            case 2:
//                System.out.println("hola, gracias para llamar");
//            case 3:
//                System.out.println("merhaba, aradiginiz icin tesekkurler");
//            case 4:
//                System.out.println("privet, spasibo za vash zvonok");
//            case 5:
//                System.out.println("Merci ,pour votre appel");
//            case 6:
//                System.out.println("salam, zeng ettiginiz ucun mennatdariq");
//                break;
//            default:
//                System.out.println("No valid number");
//        }
           // Option 3. Using swith statement but printing with String variable
        String message = "";
        switch (userOption) {
            case 1:
                message = "hello, thanks for your call";
                break;
            case 2:
                message = "hola, gracias para llamar";
                break;
            case 3:
                message = "merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                message = "privet, spasibo za vash zvonok";
                break;
            case 5:
                message = "Merci ,pour votre appel";
                break;
            case 6:
                message = "salam, zeng ettiginiz ucun mennatdariq";
                break;
            default:
                message = "No valid number";
        }
        System.out.println(message);
    }
}
