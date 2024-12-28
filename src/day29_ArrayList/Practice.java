package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {
//
//        ArrayList<String> drinks = new ArrayList<>();
//
//        drinks.add("Vodka");
//        drinks.add("Raki");
//
//        System.out.println(drinks);
//
//        drinks.addAll(0, Arrays.asList("Pepsi", "Cola"));
//
//        System.out.println(drinks);



        ArrayList <String> jobs = new ArrayList <> ();


        jobs.addAll(Arrays.asList("SDET", "BA", "PO"));

        jobs.add(1, "QA");


        System.out.println(jobs);

       // jobs.removeAll(Arrays.asList("SDET", "QA"));

//        System.out.println(jobs);
//
//        jobs.retainAll(Arrays.asList("SDET"));

      //  System.out.println(jobs);
//
//       boolean ifContain =  jobs.containsAll(Arrays.asList("SDET"));
//
//        System.out.println(ifContain);



        ArrayList <Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(4, 2, 87, 23, 76, 11));


        Collections.sort(numList);

        System.out.println(numList);

        Collections.reverse(numList);

        System.out.println(numList);

        //Collections.min(numList);

        System.out.println(Collections.max(numList));

        Collections.swap(numList, 0, 2);

        System.out.println(numList);



    }
}
