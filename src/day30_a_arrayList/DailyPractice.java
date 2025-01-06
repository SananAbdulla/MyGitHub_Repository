package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DailyPractice {

  //  public static void main(String[] args) {

//        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
//
//        System.out.println(reverseAllInList(list));




  //  }

//    public static ArrayList<String> reverseAllInList (ArrayList <String> originalList) {

//        ArrayList <String> reverseList = new ArrayList <> () ;
//
//
//        for (String each : originalList) {
//            String reverse = "";
//
//            for (int i = each.length()- 1; i>=0 ; i--) {
//
//                reverse += each.charAt(i);
//            }
//
//            reverseList.add(reverse);
//        }
//
//
//
//        return reverseList;


  //  }


    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9, 11, 7, 7));
        System.out.println("Original: " + nums);

        System.out.println(RemovedDuplicates(nums));


    }


public static ArrayList<Integer> RemovedDuplicates (ArrayList<Integer> list) {

      ArrayList<Integer> uniqueList = new ArrayList<Integer> ();

      for (int each :list) {

          if (Collections.frequency(list, each) == 1) {
              uniqueList.add(each);

          }

      }

    return uniqueList;
}

}
