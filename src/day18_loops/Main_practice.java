package day18_loops;

import java.util.Scanner;

public class Main_practice {

    public static void main(String[] args) {

//
//        String str = "2juMp41EEkd4s4&";
//        int upperCaseCount = 0;
//        int lowerCaseCount = 0;
//        int numCount = 0;
//        int otherCharCount = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
////            char eachChar = str.charAt(i);
//
//            System.out.println(str.charAt(i));


        // Remove Duplicates



//        String word = "khskfhlfjkfjokhkjnlkjgfdsa";
//        String unique = "";
//
//
//        for (int i = 0; i< word.length(); i ++) {
//            char eachChar = word.charAt(i);
//            if (!unique.contains(""+eachChar)) {
//                unique += eachChar;
//            }
//
//
//        }
//
//        System.out.println(unique);



        // break and continue for loop

//
//        for (int i = 0; i < 10; i++) { // tradionalt fo loop
//            System.out.print(i + " ");
//        }
//
//        System.out.println("----------");
//
//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " ");
//            if (i == 5) {
//                break;
//            }
//
//        }

//
          // count Java

        String str = "JAVA is a good coding language and java requires good logics java kdjsldjs java";
        //            0123456                                                    java
//        int countJava = 0;
//
//
//        for (int i =0; i < str.length()-3; i++) {
//
//         // String every4Chars = "" +str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i + 3); // 1.Option
//
//            String every4Chars = str.substring(i, i+4);
//
//            if (every4Chars.equalsIgnoreCase("java")){
//                countJava++;
//            }
//        }
//        System.out.println(countJava);


        int userEnteredNum;
        int count = 0;

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your number");
        userEnteredNum = key.nextInt();

        for (int i = 1; i <= userEnteredNum; i++ ) {
            if (userEnteredNum % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println(userEnteredNum + " is a Prime number");
        }
        else {
            System.out.println(userEnteredNum + " is not a Prime number");
        }


    }
}
