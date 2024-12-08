package day22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


//        Scanner key = new Scanner(System.in);
//
//
//        System.out.println("How may elements you array will have");
//
//        int elementsOfArray = key.nextInt();
//
//
//        int [] userNumbers = new int [elementsOfArray];
//
//        int biggest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//
//
//        for (int i = 0; i < userNumbers.length; i++) {
//            System.out.println("Enter your number " + (i+1));
//
//            userNumbers [i] = key.nextInt();
//
//        }
//        for (int each: userNumbers) {
//
//            if (each > biggest) {
//                biggest = each;
//            }
//            if (each < smallest) {
//                smallest = each;
//            }
//        }




//        System.out.println("Smallest number" + smallest);
//        System.out.println("Biggest number " + biggest);





//                 // Longest Shortest word
//
//        String [] words = {"java", "selenium", "softskill", "mentors", "loop", "Azerbaijan", "hel"};
//
//
//        String longest = words[0];
//        String shortest = words[0];


//        for (String each :words) {
//
//            if (each.length() >=  longest.length()) {
//                longest = each;
//
//            }
//            if (each.length()<= shortest.length()) {
//                shortest = each;
//            }
//        }
//
//        System.out.println("Longest word is: " + longest);
//        System.out.println("Shortest word is: " + shortest);


//        int [] number = {333, 646454, 111, 9833};
//
//
//        for (int eachElement :number) {
//
//
//            System.out.print(eachElement + ",");
//        }
//
//



//        char [] letters = "Azerbaijan".toCharArray();
//
//
//        System.out.println(letters);
//        System.out.println(Arrays.toString(letters));



        //// find words count

//        String str = "monday tuesday wednesday thursday friday saturday sunday";
//
//        String [] word = str.split(" ");
//
//        System.out.println(word.length);


       //  Reverse a sentence in Array


//        String str = "Azerbaijan is the land of fire";
//
//        System.out.println(str.length());
//        System.out.println("Before reverse "+ str);
//        System.out.println("--------------");
//        String [] newStr = str.split(" ");
//        System.out.println(Arrays.toString(newStr));
//
//
//        String reversed = "";
//
//
//        for (int i =newStr.length-1 ; i>=0 ; i--) {
//            reversed += newStr[i] + " ";
//
//        }
//        reversed = reversed.trim();
//
//        System.out.println("After a reverse \n" + reversed);


           // Array Sort

        int [] nums = {500, 1120, -90, 90, 250, - 100};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));


        System.out.println("Smallest element is: " + nums[0] );
        System.out.println("Largest element is: " + nums[nums.length-1]);



    }
}
