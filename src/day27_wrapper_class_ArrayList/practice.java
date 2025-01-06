package day27_wrapper_class_ArrayList;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

       int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

       int [] b = addElementArr (a, 10);


        System.out.println(Arrays.toString(b));


        System.out.println("-----------------------");



       int [] c =addElementArr(b, 3, 4, 56, 76);

        System.out.println(Arrays.toString(c));




    }



    public static int [] addElementArr (int []arr, int num) {

        int [] addedAr = Arrays.copyOf(arr, arr.length+1);

        addedAr [addedAr.length -1 ] = 10;


        return addedAr;

    }

    public static int[] addElementArr (int []arr, int ... arr2) {

        int [] addedAr = Arrays.copyOf(arr, arr.length + arr2.length);

        for (int i = arr.length, j = 0; i < addedAr.length; i++, j++) {

            addedAr [i] = arr2[j];




        }
        return addedAr;
    }
}
