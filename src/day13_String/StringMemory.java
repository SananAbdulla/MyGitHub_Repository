package day13_String;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {


//        String str1 = "Monday";
//        String str2 = new String ("Monday");
//
////        String a;
////        a = "A";
////        a = "B";
////        System.out.println(a);
////
////        System.out.println(str1.equalsIgnoreCase(str2));
////        System.out.println(str1 == str2);
//
////        int num = 9000;
////        System.out.println((num + "").length());
//
//        String food = "Apple";




//        String opt = "True";
//        switch (opt) {
//            case "True":
//                System.out.println("True");
//                break;
//            default:
//                System.out.println("False");
//        }
//
//        System.out.println("Done");

        String referenceName1 = "Apple";
        String referenceName2 = "apple";

        String referenceName = new String ("Apple");

        System.out.println(referenceName);
        System.out.println(referenceName1);

        boolean areEqual = referenceName1.equalsIgnoreCase(referenceName2);
        boolean areEquals = referenceName1==referenceName;
        boolean areEquals2 = referenceName1.equals(referenceName);




        System.out.println(areEqual);
        System.out.println(areEquals);
        System.out.println(areEquals2);

        System.out.println("Compraing with .equals()" + new String ("Apple").equals(referenceName1));
        System.out.println(referenceName1.trim().length());

        int num = 9;
        System.out.println((num +"").length());



        String a = "";
        String b = "*";

        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());


        String ab = "Apple";

        System.out.println(ab.indexOf('A'));
        System.out.println(ab.charAt(1));

        System.out.println(ab.length()-1);
        System.out.println(ab.charAt(ab.length()-1));






    }
}
