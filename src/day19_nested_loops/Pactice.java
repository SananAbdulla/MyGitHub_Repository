package day19_nested_loops;

public class Pactice {

    public static void main(String[] args) {
//
//        //System.out.println("welcome");
//        for (int i = 1; i <=3; i++) {
//            System.out.println("Hi guys");
//            for (int j = 1; j <=2 ; j ++) {
//                System.out.println("thank you");
//                System.out.println();
//            }
//
//        }



                 // Multiplication Table

//
//        for (int i = 1; i <=10 ; i++) {
//
//            for (int j = 1; j <=10 ; j++) {
//
//                System.out.println(i + " x " + j +" = " + (i*j));
//
//
//
//                }
//
//            System.out.println();
//
//            }


        // Frequency of Characters



        String str = "apple";
        String unique = "";



        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            char outerLetter = str.charAt(i);
            if(unique.contains(""+outerLetter)) {
                continue;
            }


            for (int j = 0; j < str.length(); j++) {

                char innerLetter = str.charAt(j);

                if (outerLetter == innerLetter) {
                    count++;
                }



            }
            System.out.println(outerLetter + " " + count);
            unique += outerLetter;
        }



    }
}
