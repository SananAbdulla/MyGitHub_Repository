package day23_2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


//        int [] a = {1, 2, 3, 4, 5};
//
//        int [] b = a;
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//
//
//
//        int [] z = Arrays.copyOf(a, a.length*2);
//
//         z [5] = 10;
//         z [6] = 11;
//
//        System.out.println(Arrays.toString(z));


        // add Elements

        Scanner key = new Scanner(System.in);


//        System.out.print("Please, enter the size of arr: ");
//        int sizeArr1 = key.nextInt(); // 6
//        int[] arr1 = new int[sizeArr1];
//
//        for (int i = 0; i < arr1.length; i++) {
//
//            System.out.print("Please enter value for index " + (i +1) + ": ");
//
//            arr1 [i] = key.nextInt();
//
//
//
//        }
//
//        System.out.println(Arrays.toString(arr1));


//        System.out.println("Please enter the size of Array");
//
//        int sizeArray = key.nextInt();
//
//        int [] arr1 = new int [sizeArray];
//
//        for (int i = 0; i <arr1.length ; i++) {
//            System.out.println("Please enter the " + (i+1)+ " 3element of array");
//            arr1 [i] = key.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.print("Please, enter how many additional elements you want to add into array: ");
//        int additionalSize = key.nextInt();
//
//        int [] arr2 = Arrays.copyOf(arr1, arr1.length + additionalSize);
//
//        System.out.println(Arrays.toString(arr2));
//
//
//        for (int i = arr1.length; i < arr2.length ; i++) {
//
//            System.out.print("Please, enter a value for index " + i + ": ");
//
//            arr2[i] = key.nextInt();
//
//
//
//        }
//        System.out.println(Arrays.toString(arr2));




//int a = 0;
//while (a <= 6) {
//    a+=2;
//}
//        System.out.println(a);
//


//        int i = 0;
//
//        do {
//            i++;
//            System.out.println(i + " ");
//        }while (i <=4);

//
//        for (int i = 0; i < 5 ; i--) {
//            System.out.println("hi");
//        }


//        int z = 5;
//
//        for (int i = 5; i > 0 ; i--) {
//            z+=i;
//
//        }
//        System.out.println(z);


                    // 2D array

//        int [] n = {5, 10, 20, 10};         // Single dimensional array
//        int [] m = {5, 10, 100, 39, 19};
//
//        int [] [] all = {n, m};
//
//        System.out.println(all.length);

                  //Option 1

//        int [] [] z = {{5, 10, 20, 10},         // Single dimensional array
//                    {5, 10, 100, 39, 19} };
//
//        System.out.println(Arrays.deepToString(z));
//
//                  // Option 2
//
//        for (int i = 0; i < z.length ; i++) {
//            for (int j = 0; j < z[i].length; j++) {
//                System.out.println(z[i][j] + " ");
//
//            }
//            System.out.println();



//        }


                  // 2D Arrays
//
//        String [] group1 = {"Artem", "Diana", "Yuliia", "Roma"};
//        String [] group2 = {"Pavlo", "Steven", "Ketevan"};
//
//        String [] [] newGroup =  {group1, group2};
//
//
//        System.out.println(Arrays.deepToString(newGroup));
//
//        System.out.println("----------------");
//
//                   // OPTION 1
//
//        for (String [] each : newGroup) {
//            for (String eachName:each) {
//                System.out.println(eachName);
//            }
//        }
//
//
//               // OPTION 2
//        System.out.println("*******************");
//
//        for (int i = 0; i < newGroup.length; i++) {
//            for (int j = 0; j < newGroup[i].length ; j++) {
//                System.out.println(newGroup[i][j]);
//
//            }
//
//        }

        int num = 4;

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3, 4:
                System.out.println("lol");
                break;
            default:
                System.out.println("bye");

        }

    }
}
