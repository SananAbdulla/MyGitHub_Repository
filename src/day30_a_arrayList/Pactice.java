package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pactice {
    public static void main(String[] args) {

//        ArrayList<Integer> number = new ArrayList <> () ;
//        number.addAll(Arrays.asList(2, 4, 5, 6, 22, 11 ,77));
//
//        System.out.println(number);
//
//        Integer num1 = Collections.min(number);
//
//        System.out.println(Collections.max(number));
//
//        System.out.println(num1);
//
//        Collections.swap(number, 0, number.size()- 1);
//
//        System.out.println(number);


        String str = "Azerbaijan";
        //System.out.println(Arrays.asList(str.split("")));

       ArrayList <String> letterList = new ArrayList <> (Arrays.asList(str.split(""))) ;

        System.out.println(Arrays.asList(str.split("")));

        Integer letterCount = Collections.frequency(letterList, "a");

        System.out.println(Collections.frequency(letterList, "a"));
        System.out.println(letterCount);


        ArrayList <String> week = getDaysOfWeek();

        System.out.println(week.get(0));


        ArrayList <Integer> nums1 = new ArrayList<>(Arrays.asList( 3, 54, 23, 76, 87, 34, 23, 7, 9));
        nums1.removeIf( eachElement -> eachElement < 49);

        System.out.println(nums1);


        for (int i = 0; i < nums1.size(); i++) {
            nums1.set(i, nums1.get(i)*2);


        }
        System.out.println(nums1);

    }

    public static ArrayList<String> getDaysOfWeek () {
        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));

        return weekDays;
    }
}
