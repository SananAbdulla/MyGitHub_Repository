package day24_Methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        // String str = sayHi(); // Since this method is a VOID method, it does NOT return anything back.
//        sayHi();
//
//        System.out.println();
//        sayHi2();
//        System.out.println(sayHi2());
//
//        String str = sayHi2();
//        System.out.println(str);
//
//
//    }
//
//
//    // This is a void type method - which means does not return anything.
//    public static void sayHi () {
//        System.out.println("Hi");
//    }
//
//    // This is a return type method - which means it RETURNS something. Something can be any data type
//    public static String sayHi2 () {
//        String str = "Hi";  // Local Variable
//        return str;
//
//

        //

        int[][] numbers = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };


//        for (int []each : numbers) {
//            int sum = 0;
//
//            //System.out.println(Arrays.toString(each));
//
//            for (int eachElement:each) {
//                //System.out.print(eachElement);
//                sum += eachElement;
//            }
//            System.out.println("Average of " + Arrays.toString(each) + " is: " + sum/ each.length);


//        double totalSum = 0;
//        int totalLength = 0;
//
//
//        for (int [] each:numbers) {
//            double sumEachArray = 0;
//
//            for (int eachElement: each) {
//                sumEachArray += eachElement;
//
//            }
//            totalSum += sumEachArray;
//            totalLength += each.length;
//
//
//
//
//
//            System.out.println("Avarege of " + Arrays.toString(each) + " is " + sumEachArray/each.length);
//            System.out.println("---");
//        }
//
//        System.out.println(totalLength);


        // Last Character

//
//        String [][] words = {
//                {"James", "is", "back"},
//                {"he", "was", "never", "gone"},
//                {"methods", "tomorrow"},
//        };
//
//        for(String [] each :words) {
//
//            String lastChar = "";
//
//            for (String eachElement :each) {
//
//                lastChar += eachElement.charAt(eachElement.length()- 1);
//            }
//
//            System.out.println(lastChar);
//
//        }


        int[] num1 = {213, 45, 23, 65, 87, 98, 43}; // 7 elements -- > ODD

        findFirstElement (num1);

    }
        public static void findFirstElement (int [] arr) {

            System.out.println( arr[arr.length-1] );
            System.out.println(arr[2]);

        }



    }

