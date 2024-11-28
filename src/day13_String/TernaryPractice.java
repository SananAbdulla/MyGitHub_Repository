package day13_String;

public class TernaryPractice {
    public static void main(String[] args) {
        // If the number is less than 10 and bigger than or equal -9, then print "number is single digit", else print "number is multi digit"
        int num = 1;
        // OPTION 1 - with IF-ELSE

//        if (num <10 && num >= -9) {
//            System.out.println("Number is single digit");
//
//        }else
//            System.out.println("Number is multi digit");


    // Option 2. Using Trenary
        String result;

     result= (num <10 && num >= -9) ? "Number is single digit" : "Number is multi digit";
//
       System.out.println(result);
       // System.out.println((num <10 && num >= -9) ? "Number is single digit" : "Number is multi digit");




    }
}
