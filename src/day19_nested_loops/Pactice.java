package day19_nested_loops;

import java.util.Scanner;

public class Pactice {

    public static void main(String[] args) {
//
//        //System.out.println("welcome");
//        for (int i = 1; i <=3; i++) {
//            System.out.println("Hi guys");
//            for (int j = 1; j <=2 ; j ++) {
//                System.out.println("thank you");
//                System.out.println();
//            }
//
//        }



                 // Multiplication Table

//
//        for (int i = 1; i <=10 ; i++) {
//
//            for (int j = 1; j <=10 ; j++) {
//
//                System.out.println(i + " x " + j +" = " + (i*j));
//
//
//
//                }
//
//            System.out.println();
//
//            }


        // Frequency of Characters



//        String str = "apple";
//        String unique = "";
//
//
//
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//
//            char outerLetter = str.charAt(i);
//            if(unique.contains(""+outerLetter)) {
//                continue;
//            }
//
//
//            for (int j = 0; j < str.length(); j++) {
//
//                char innerLetter = str.charAt(j);
//
//                if (outerLetter == innerLetter) {
//                    count++;
//                }
//
//
//
//            }
//            System.out.println(outerLetter + " " + count);
//            unique += outerLetter;
//        }


                // UniqueCharacters

        //String str = "bbCD$CSTGF(ldslkfja;lskdnfa;dvsba";

        // find the only unique chars

        // Outer Loop
//        for (int i = 0; i < str.length() ; i++) {
//            int count = 0;
//            char eachLetter1stLoop = str.charAt(i);
//
//            // inner Loop
//            for (int j = 0; j < str.length(); j++) {
//                char eachLetter2ndLoop = str.charAt(j);
//
//                        if (eachLetter1stLoop == eachLetter2ndLoop) {
//
//                            count ++;
//                        }
//
//            }
//            if (count == 1) {
//                System.out.print(eachLetter1stLoop);
//            }
//
//        }



                                // Anagram


//        String str1 = "listen";
//        String str2 = "silent";
//
//
//
//        if (str1.length() != str2.length()) {
//            System.out.println("Not Anagram");
//        }
//        else {
//
//            for (int i = 0; i < str.length(); i++) {
//
//                char eachChar = str1.charAt(i);
//                str2.replaceFirst(eachChar + "", "");
//
//            }
//            if (str2.isEmpty()) {
//                System.out.println("it is Anagram");
//            }
//            else {
//                System.out.println("not Anagram");
//
//            }
//        }


//        Scanner key = new Scanner(System.in);
//        System.out.println("please enter numbers");
//
//        int userNum = key.nextInt();
//
//
//        for (int i = 1; i <= userNum ; i++) {
//
//            int count = 0;
//
//            for (int j = 1; j <= i ; j++) {
//
//                if (i % j == 0) {
//                    count ++;
//
//                }
//
//            }
//            if (count == 2) {
//                System.out.println(i + "");
//            }
//
//
//        }

//        int num = 20;
//
//        for (int i = 1; i <=20; i++) {
//            int count = 0;
//
//            for (int j = 1; j <=i ; j++) {
//
//                if (i % j == 0) {
//                    count++;
//                }
//
//            }
//            if (count == 2) {
//                System.out.println(i);
//            }
//
//        }



        String str = "AbbCD$CSTGF(ldslkfja;lskdnfa;dvsba";



        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char each1Letter = str.charAt(i);


            for (int j = 0; j < str.length() ; j++) {
                char each2Letter = str.charAt(j);

                if (each1Letter == each2Letter) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(each1Letter);
            }


        }






    }
}
