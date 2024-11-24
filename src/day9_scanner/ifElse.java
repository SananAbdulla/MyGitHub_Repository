package day9_scanner;
import java.util.Random;
import java.util.Scanner;
public class ifElse{
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int myNum = scan.nextInt();
        //scan.nextLine();

        Random myRandom = new Random();
        int RandomNum = myRandom.nextInt(5)+1;
        System.out.println(RandomNum);


       if(myNum > RandomNum) {
           System.out.println("Your number is bigger than Random one");

           }  else if (myNum == RandomNum) {
                System.out.println("Numbers are  are equal");
       }
        else
           System.out.println("Random number was bigger");






    }
}
