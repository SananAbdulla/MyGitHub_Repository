package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static void main(String[] args) {



        ArrayList<String> numsAsString = new ArrayList<>();
        numsAsString.addAll( Arrays.asList( "123", "34", "513", "3456", "123456") );
        System.out.println("Original: " + numsAsString);


        System.out.println(sumOfElementsFromString(numsAsString));


    }


    public static ArrayList<Integer> sumOfElementsFromString (ArrayList<String> numsAsString) {

        ArrayList <Integer> resultList = new ArrayList <>();


        for (String each : numsAsString) {

            int sumOfAll = 0;
            for (String eachElement:each.split("")) {

                sumOfAll += Integer.parseInt(eachElement);
            }
            resultList.add(sumOfAll);

        }


        return resultList;
    }
}
