package day27_wrapper_class_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


        /*
             ArrayList
                       - size is flexible
                       - works only with Object data type


         */


        ArrayList <Integer> arrList = null;
        ArrayList <Integer> arrList2 = new ArrayList<>();

        System.out.println(arrList);
        System.out.println(arrList2.size());

        System.out.println("---------------");

        ArrayList <Integer> arrList3 = new ArrayList<Integer>();
        System.out.println(arrList3.size());

        arrList3.add(55);

        System.out.println(arrList3.size());
        System.out.println(arrList3);
        arrList3.add(0,35);
        System.out.println(arrList3.indexOf(35));
        System.out.println(arrList3.get(0));
        System.out.println(arrList3.get(arrList3.size()-1));



      Integer num = 30;

      int num2 = num;



    }
}
