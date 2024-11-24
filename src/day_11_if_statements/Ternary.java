package day_11_if_statements;

public class Ternary {
    public static void main(String[] args) {


        int a = 35;
        String result;

        if (a % 2 == 0) {
            result = "Even number";
        } else {
            result = "Odd number";
        }
        System.out.println(result);


        // OPTION 2

//        result = (a%2==0) ? "even number from Ternary":"Odd Number from ternary";
//        System.out.println(result);



        // OPTION 3
//int num = 10;
//String result;
//
//        result = (num <10 && num >=-9) ? "Number Single digit" : "Number is multi digit";
//        System.out.println(result);


    }
}
