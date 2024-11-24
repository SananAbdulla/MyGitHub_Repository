package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {


/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
        Ex:
            Input: elephant -- > 8
            //     01234567
            Output: The middle characters: ph

 */

        String word = "elephan";
        String mid = "";

        // find mid char or chars
           // if length is even, take mid 2 chars ==> if (word.length() % 2 ==0)
           // if length is odd, take mid 1 char   ==> if (word.length() % 2 !==0)

        if (word.length() % 2 == 0) {
        mid  = word.substring(word.length()/2-1, word.length()/2+1);
      //   mid = "" + word.charAt(word.length()/2- 1) + word.charAt(word.length()/2)); // this is
            // other option

        } else  {
            mid = word.substring(word.length()/2,word.length()/2 +1);


        }

        System.out.println(mid);
















    }
}
