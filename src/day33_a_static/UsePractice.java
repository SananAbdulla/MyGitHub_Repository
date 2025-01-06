package day33_a_static;

import java.util.Arrays;
import static day33_a_static.LoopcampStudent.*;

public class UsePractice {
    public static void main(String[] args) {

       Practice practice1 = new Practice("Diana");
//       practice1.mentor = "Diana";
        System.out.println(practice1);

       // System.out.println(Arrays.toString(Practice.teachers));

        for (String each : Practice.teachers) {

            System.out.println(each);
        }

        printStaticInfo ();

    }
}
