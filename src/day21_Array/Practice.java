package day21_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


//        Scanner key = new Scanner(System.in);
//
//        String [] month = {"Jan", "Feb", "Mar","Apr", "Jun", "Jul", "Aug","Sep", "Oct", "Nov","Dec"};
//
//        int userNum;
//
//
//        do {
//            System.out.println("Enter a number");
//            userNum = key.nextInt();
//
//            if (userNum >=1 && userNum <=12 ) {
//
//                System.out.println("Entered month " + userNum + " is " + month [userNum -1]);
//
//
//            }
//            else {
//                System.out.println("Entered number is not in the wange");
//            }
//
//        } while (userNum< 1 || userNum > 12);



        // SUMP up Elemenets



//        int [] numbers = {22, 44, 55, 33, 543, 654};
//
//
//        int sum=0;


//        for (int each:numbers) {
//
//
//            sum += each;
//
//
//        }
//
//        System.out.println("Avarage " + sum/ numbers.length);
//
//        System.out.println("Avarage " + sum/ numbers.length);


        // ption 2
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            sum += numbers [i];
//
//
//        }
//
//        System.out.println();
//
//
//        System.out.println(sum);
//        System.out.println("Avarage " + sum/ numbers.length);



                   // Student info

//        Scanner key = new Scanner(System.in);
//
//        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: "};
//        String [] student4 = new String[questions.length];
//
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//            student4 [i] = key.nextLine();
//
//
//        }
//
//
//        System.out.println(Arrays.toString(student4));



                          // Reverse Array

        // OPTION 1

//        int [] numbers = {22, 44, 55, 33, 543, 654};
//
//
//        String result = "[";
//
//        for (int i = numbers.length-1; i >=0 ; i--) {
//
//
//            result += numbers[i] + ",";
//        }
//
//        result = result.substring(0, result.length()-2) + "]";
//        System.out.println(result);
//        System.out.println(Arrays.toString(numbers));

        // OPTION 2

//        int [] numbers = {22, 44, 55, 33, 543, 654, 45678, 8765};
//
//        int [] reversed = new int [numbers.length];
//
//        for (int i = 0; i < numbers.length ; i++) {

//            reversed [reversed.length - 1 - i] = numbers [i] ;
//
//
//        }
//        String reversedArray = Arrays.toString(reversed);
//        reversedArray = reversedArray.substring(1, reversedArray.length()-1).replace(',' , ' ');
//
//        System.out.println("Original Array " + Arrays.toString(numbers));
//        System.out.println("Reversed Array " +Arrays.toString(reversed));
//
//        System.out.println(reversedArray);



                 // Initials using loop

//        String [] classmates = {"james Bond", " eve Rell", " Anna johnson "};
//        System.out.println("I have " + classmates.length + " full names.");



//
//        for (int i = 0; i < classmates.length; i++) {
//
//            String fullName = classmates[i].toUpperCase().trim();
//
//         String firstName = fullName.substring(0, fullName.indexOf(" "));
//         String lastName = fullName.substring(fullName.indexOf(" ")+1);
//
//            System.out.println(" "+ firstName.charAt(0) + lastName.charAt(0));
//
//        }
        //System.out.println(Arrays.toString(classmates));



                        // Friend List

//        Scanner key = new Scanner(System.in);
//        System.out.print("Please, enter how many fiends you have: ");
//
//        String[] friendList = new String[key.nextInt()];
//
//        key.nextLine();
//
//        for (int i = 0; i < friendList.length; i++) {
//
//            friendList [i] = key.nextLine();
//
//        }
//
//        System.out.println(Arrays.toString(friendList));

                   // using same for numbers

       //TODO remember
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter how many numbers you have: ");

        int [] numbers = new int [key.nextInt()];


        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter number: " + (i+1));
            numbers [i] = key.nextInt();

        }

        String ArraysToString = Arrays.toString(numbers);


        System.out.println(ArraysToString.substring(1, ArraysToString.length()-1));


    }
}
