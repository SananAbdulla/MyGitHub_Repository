package day19_nested_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

   //TODO check this task

/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
          Scanner key = new Scanner(System.in);
                System.out.print("Please, enter multi words sentence: ");
                String str = key.nextLine().trim().toLowerCase(); // Today is sUNDAY ---- > today is sunday
                String camelcase = "" + str.charAt(0);  // t

        // I love you
        // 0123456789

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i- 1) == ' ') {
               camelcase += (""+str.charAt(i)).toUpperCase();

            }
            else  {
                camelcase +=str.charAt(i);
            }

        }
        System.out.println(camelcase);


    }
}
