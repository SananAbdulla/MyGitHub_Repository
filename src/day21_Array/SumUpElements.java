package day21_Array;

import java.util.Arrays;

public class SumUpElements {
    public static void main(String[] args) {


        /*

    declare and assign an array of numbers

        {3, 6, 10}

    sum all the numbers in the array

 */

        int [] nums = {3, 6, 20};
                System.out.println("Size of array: " + nums.length);
                System.out.println("Each element: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
                System.out.println("All elements: " + Arrays.toString(nums).substring(1, Arrays.toString(nums).length()-1)); // [All elements: 3, 6, 10]


                System.out.println();
                for (int i = 0; i < nums.length; i++) {
                    System.out.println( nums [i] );
                }

                System.out.println();
                int sum = 0;
                for (int i = 0; i < nums.length; i++) {
                    //System.out.println( nums [i] );
                    sum += nums[i];
                }
                System.out.println("Sum up for all elems: " + sum);


            }
}
