package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practicessss {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList( 30, 5, 2, 64, 23, 23 ,230, 64, 32, 66));
        System.out.println("Original: " + nums);

        System.out.println("Good Pairs: " + keepGoodPairs(nums));

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList( 30, 5, 2, 64, 23, 23 ,230, 64, 32, 66));
        for (int i = 0; i < nums2.size(); i++) {

            if (nums2.get(i) <31) {
                nums2.remove(i);
                i--;
            }

        }
        System.out.println(nums2);


    }

    public static ArrayList<Integer> keepGoodPairs (ArrayList<Integer> list) {

      ArrayList<Integer> goodPairs = new ArrayList<>();
        for (int i = 0; i <list.size() ; i+=2) {
            if (list.get(i)<= list.get(i+1)) {
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i + 1));

            }
        }


        return goodPairs;
    }

}
