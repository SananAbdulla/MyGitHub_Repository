package day21_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        String [] cities = new String[4];
//
//         int [] num = {20, 60, 50, 100};
//         int sum = 0;
//        System.out.println(cities1[1]);
//
//        System.out.println(Arrays.toString(cities1));


//        double [] arr1 = new double[4]; // Created an array with 4 memory locations.
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(arr1.length);


//        for (int i = 0; i <num.length ; i++) {
//
//            System.out.println(num[i]);
//            sum += num[i];
//
//
//        }
//        System.out.println(sum);

//        Scanner key = new Scanner(System.in);
//
//
//        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: "};
//        String [] student4 = new String[4];
//
//
//        for (int i = 0; i < questions.length ; i++) {
//            System.out.println(questions[i]);
//            student4 [i] = key.nextLine();
//
//        }
//        System.out.println(Arrays.toString(student4).substring(1, Arrays.toString(student4).length()-1));


//        int [] nums = {3, 4, 5, 22};
//
//        for (int eachElements:nums) {
//            System.out.println("For each loop " + eachElements);
//        }


//        String [] names = new String[4];
//
//        for (int i = 0; i < names.length ; i++) {
//            names [0] = "Tom";
//
//        }
//
//        System.out.println(Arrays.toString(names));


//        int [] nums = {10, 15, 7, 3, 45};
//        int sum = 0;
//
//        for (int i = 0; i < nums.length ; i++) {
//            sum += nums[i];
//
//        }
//        System.out.println(sum);


        // Reverse
//
//                int [] nums = {10, 15, 7, 3, 45};
//                int [] reverse = new int [nums.length];
//
//
//        for (int i = 0; i < nums.length; i++) {
//
//            reverse [i] = nums[nums.length - 1 - i];
//
//        }
//
//        for (int i = 0; i < reverse.length ; i++) {
//
//        }
//
//        System.out.println(Arrays.toString(reverse));


        // Month
//        Scanner key = new Scanner(System.in);
//        System.out.println("Please, enter a number and I will give you month name.");
//        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//        int userNum = key.nextInt();
//
//        do {
//            System.out.println("Enter");
//            if (userNum>= 1 || userNum <= 12) {
//                 if (userNum == 1){
//                    System.out.println("Month of 1 " + "is " + months[userNum-1]);
//                }else {
//                     System.out.println("Out of range");
//                 }
//            }
//
//
//        }
//        while (userNum<1 || userNum > 12);
//


        // Sum Elements

//        int [] nums = {3, 6, 20, 77, 55, 5};
//
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//
//        }
//        System.out.println(sum);


        //  Student info

//        Scanner key = new Scanner(System.in);
//
//        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: "};
//        String [] student4 = new String[4];
//
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//            student4 [i] = key.nextLine();
//
//        }


        // for each loop

        //int [] nums = {3, 6, 20, 77, 55, 5, 33, 22};

//        for (int each : nums) {
//
//            System.out.print(each + " ");
//
//        }

//        for (int i = 0; i < nums.length; i++) {
//            nums [i] = 10;
//            System.out.print(nums[i] + " ");
//        }


//        for (int i = nums.length/2; i < nums.length ; i++) {
//            System.out.println(nums[i]);
//        }


        // Avarege number
//        double [] nums = {3, 6, 20, 77, 55, 5, 33, 22};
//        double sum = 0;
//
//
//        for (double each : nums) {
//            sum +=each;
//            System.out.print( each + " ");
//
//
//        }
//
//        System.out.println("\nSum of numbers " + sum);
//        System.out.println("\nAvarege numbers " + sum/ nums.length);


//        String word = "Azerbaijan";
//        String reversed = "";

//        for (int i = word.length()-1; i >=0 ; i--) {
//            reversed += word.charAt(i);
//
//
//        }
//        System.out.println(reversed);


        // Count Even and Odd


//        int [] nums = {3, 6, 20, 77, 55, 5, 33, 22};
//
//        int countEven = 0;
//        int countOdd = 0;
//        String evenNums = "";
//        String oddNums = "";
//
//        for (int each : nums) {
//
//            if (each % 2 == 0) {
//                countEven ++;
//                evenNums+= each +", ";
//            }else {
//                countOdd++;
//                oddNums+=each + ", ";
//            }
//        }
//
//        System.out.println("Even numbers " + countEven);
//        System.out.println("Odd numbers "+countOdd);
//
//        System.out.println(evenNums);
//        System.out.println(countOdd);


        // Reverse Array

        // OPTION 1

//        int [] nums = {3, 6, 20, 77, 55, 5, 33, 22};

//        String result = "[";
//
//
//        for (int i = nums.length-1 ; i >= 0 ; i--) {
//
//            result += nums[i] + ", ";
//
//        }
//        System.out.println(result);
//        result = result.substring(0, result.length()-2) + "]";
//        System.out.println(result);


        // OPTION 2

//        int[] nums = {3, 6, 20, 77, 55, 5, 33, 22};
//
//        int[] reversed = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            reversed[reversed.length - 1 - i] = nums[i];
//
//
//        }
//
//        System.out.println(Arrays.toString(reversed));
//
//



                          // FriendList

//        Scanner key = new Scanner(System.in);
//        System.out.println("How many friends you have? ");
//
//        String [] friendList = new String[key.nextInt()];
//
//        key.nextLine();
//
//        for (int i = 0; i < friendList.length; i++) {
//
//            System.out.println("Please enter the names of friend: " + (i+1) + ":");
//            friendList [i] = key.nextLine();
//
//        }
//
//        System.out.println("I have " + friendList.length + " friends. My Friend list is: ");
//
//        for (int i = 0; i < friendList.length; i++) {
//
//
//        }
//
//
//        System.out.println(Arrays.toString(friendList).substring(1, friendList.length- 2));
//
//

        String [] list = new String [5];


       list = new String [3];


        System.out.println(Arrays.toString(list));






    }
}
