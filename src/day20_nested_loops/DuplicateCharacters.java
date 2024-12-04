package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "applltte";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;

           char eachLoop1 = str.charAt(i);
            if (unique.contains(eachLoop1 + "")) {
                continue;
            }


            for (int j = 0; j < str.length(); j++) {

                char eachLoop2 = str.charAt(j);

                if (eachLoop1 == eachLoop2) {
                    count++;
                }


            }
            if (count > 1) {
                System.out.println(eachLoop1 );
            }

            if (!unique.contains(eachLoop1 + "")) {
                unique += eachLoop1;

            }


        }


    }

}
