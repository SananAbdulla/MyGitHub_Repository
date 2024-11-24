package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {


  /*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
 */


        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a URL: ");
        String url = scan.next();  // www.google.com
//        //012345678910
//
//        url = url.substring(  url.indexOf(".")+1, url.lastIndexOf(".")  );
//        //url.substring(  3, 10  );  ---- >  .google
//        System.out.println(url);



//    url = url.substring(url.indexOf(".")+1, url.lastIndexOf("."));
//        System.out.println(url);

    if (url.startsWith("www.") && url.endsWith(".com")) {
        System.out.println("Valid url: " + url);
    } else {
        System.out.println("My code is not designed to handle your URL");
    }




        //System.out.println(url);







    }
}
