package day18_loops;

import java.util.Scanner;

public class JustPractice {

    public static void main(String[] args) {

        // ShoppingList

//        String shoppingList = "These items are in your shopping list: ";
//        String userAnswer;
//
//do {
//    Scanner key = new Scanner(System.in);
//    System.out.println("Please enter items to you list");
//   // String userEnteredItems = key.nextLine();
//    shoppingList += "\n"+key.nextLine(); // 1 Option
//   // shoppingList = shoppingList + "\n" + key.nextLine(); // 2 Option
//
//    System.out.println("Do you want to add more items ?");
//    userAnswer = key.nextLine();
//
//}  while (userAnswer.equalsIgnoreCase("yes"));
//
//
//        System.out.println(shoppingList);


        // Polindrome


//        String str = "baku";
//        String reversed = "";


//        for (int i = str.length()- 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//
//        }
//
//        System.out.println(reversed);


//
//        String str = "ANA";
//
//        String reversed = "";
//
//
//        for (int i = str.length()-1; i >=0 ; i--) {
//
//            reversed +=str.charAt(i);
//
//        }
//        if (str.equalsIgnoreCase(reversed)) {
//            System.out.println("It is Palindrome ");
//        }else {
//            System.out.println("It is not palindrome");
//        }
//
//        System.out.print(reversed);


        // Count Letters


//        String word = "aabbcaa";
//        //             0123456
//        char letter = 'z';
//        int count = 0;
//
//        /*
//            I would loop through the character/letters from the word and check 1 by 1 if it is equal
//            If it is equal, I would count.
//         */
//
//        for (int i = 0; i < word.length(); i++) {
//
//            if (word.charAt(i) == letter) {  // Every char has ASCII number assigned *** a == a | a == a | b == a | b == a | c == a | a == a | a == a
//                count++;
//            }
//        }
//
//
//        System.out.println("In \"" + word + "\", we have " + count + " \'" + letter + "\' characters" );
//        System.out.println("\"Baku\" is the capital of \"Azerbaijan\"");
//
//        System.out.println("In \"" + word +"\", we have");
//
//


        // Count HI

//        String word = "hijjshi.hi.hi";
//        int count = 0;
//
//        for (int i = 0; i <word.length()-1 ; i++) {
//
//            if (word.charAt(i) =='h' && word.charAt(i+1) =='i') {
//                count++;
//
//            }
//
//        }
//        System.out.println("the\"" + word + "\", has " + count);

        // Using substring method

//        String word = "hijjshi.hi.hihshslhi";
//        int count = 0;
//
//        for (int i = 0; i < word.length()-1 ; i++) {
//
//            if (word.substring(i, i+2).equalsIgnoreCase("hi")) {
//                count++;
//
//            }
//
//        }
//        System.out.println("the\"" + word + "\", has " + count);


        // count words
        // 1 OPTION using ChatAt
//        String sentence = "The land of Fire";
//        int spaceCount = 0;
//
//        for (int i = 0 ; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == ' ') {
//                spaceCount++;
//            }
//
//        }
//
//        System.out.println("The sentence have "+ (spaceCount +1 ) + " words");


        // 2 Option using Substring

//        String sentence = "The land of Fire of Azerbaijan";
//
//        int spaceCount = 0;
//
//        for (int i = 0 ; i < sentence.length(); i++) {
//            if (sentence.substring(i, i +1).equals(" ")) {
//                spaceCount++;
//            }
//
//        }
//
//        System.out.println("The sentence have "+ (spaceCount +1 ) + " words");


//        String word = "Azerbaijan";
//
//        int charcount = 0;
//
//
//        for (int i = 0; i <word.length(); i++) {
//            charcount++;
//
//        }
//        System.out.println(charcount);


        // Remove Duplicates


//        String str = "fhzdhjdgjkdZhlshtsdsasdfghj";
//
//        String unique = "";
//
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char eachChar = str.charAt(i);
//
//            if (!unique.contains(""+ eachChar)) {
//
//                // if (!unique.contains(String.valueOf(eachChar)))
//
//                unique += eachChar;
//            }
//
//        }
//
//
//        System.out.println(unique);


//        for (int i = 1; i < 10; i++) {
//            System.out.print(i + " ");
//            if (i==5) {
//               continue;
//            }
//            System.out.println(" hi ");
//
//        }

        // Print Even numbers  1 OPTION

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println(i);
//
//        }

        // Print Even numbers  2 OPTION
//
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//
//            }
//
//        }
//


        // Count Java

//        String str = "java is a good coding language and java requires good logics java";
//        //            0123456                                                    java
//        int countJava = 0;
//
//
//        for (int i = 0; i < str.length()- 3 ; i++) {
//
//            String eachFourChars = str.substring(i, i+4);
//
//            if (eachFourChars.equals("java")) {
//                countJava++;
//            }
//
//        }
//
//        System.out.println(countJava);

        // Count Java 2

//       //TODO interesting task
//        String str = "java is a good coding language and java requires good logics java";
//        //            0123456                                                    java
//        int countJava = 0;
//
//        while (str.contains("java")) {
//
//            str = str.replaceFirst("java", "*");
//            countJava++;
//        }
//
//        System.out.println("there are " + countJava + " \"java\"");


        // Space Program

//        Scanner key = new Scanner(System.in);
//        System.out.print("Please, enter input: ");
//        String input = key.nextLine().trim().replaceAll(" ", "_");
//
//        String result ="";
//
//
//        for (int i = 0; i < input.length(); i++) {
//            result += input.charAt(i)+ " ";
//
//        }
//
//        System.out.println(input);
//
//        System.out.println(result.trim());


        // ReverseMiddle task

//        Scanner key = new Scanner(System.in);
//
//        System.out.println("Please enter a sentence");
//        String sentence = key.nextLine().trim();
//
//        int countSpace = 0;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) == ' ') {
//                countSpace++;
//
//            }
//        }
//        if (countSpace>= 2) {
//            int firstSpaceIndex = sentence.indexOf(" ");
//            int lastSpaceIndex = sentence.lastIndexOf(" ");
//            String middle = sentence.substring(firstSpaceIndex + 1 , lastSpaceIndex);
//            String reverse = " ";
//
//            for (int i = middle.length()-1; i >=0 ; i--) {
//                reverse += middle.charAt(i);
//
//            }
//            System.out.println(sentence.substring(0, firstSpaceIndex) + reverse + " " + sentence.substring(lastSpaceIndex+1));
//
//        }
//        else
//            System.out.println("Sentence has less than 3 words");


           // Camel Case

//        Scanner key = new Scanner(System.in);
//        System.out.println("Please, enter multi words sentence");
//        String str = key.nextLine().trim().toLowerCase();
//        String camelcase = str.charAt(0) + "";
//
//
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i -1) == ' ') {
//                camelcase += (""+str.charAt(i)).toUpperCase();
//            }
//            else  {
//                camelcase += str.charAt(i);
//            }
//        }
//
//        System.out.println(camelcase);





    }
}
