package day27_wrapper_class_ArrayList;

import java.util.Arrays;

public class AddElementInArr {
    public static void main(String[] args) {

    int [] a = {1, 2,3, 4, 5};

    int [] b = addElementInArr(a, 40);

        System.out.println(Arrays.toString(b));




    }

    // i need to build a function (method ) which adds the element into an array
    public static int [] addElementInArr (int []arr , int num) {

     int [] addedArr = Arrays.copyOf(arr, arr.length+1);
     addedArr [addedArr.length-1] = 40;


        return addedArr;
    }



}
