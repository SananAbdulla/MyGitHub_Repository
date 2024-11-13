package Github_Repositories;

import java.util.Scanner;

public class Switch_Statements {

    public static void main(String[] args) {



    Scanner key = new Scanner(System.in);
        System.out.println("What day do you want to know about");
    String day = key.next();
        key.close();
    String information;

        switch(day) {


        case "Monday":
            information = "We have mentor session on Mondays!";
            break;
        case "Tuesday":
            information = " We dont have a class";
            break;
        case "Wednesday":
        case "Thursday":
        case "Saturday":
            information = "We have a \"Java\" class";
            break;
        case "Friday":
            information = "We dont have a class";
            break;
        case "Sunday":
            information = "\"We have a Soft Skills class\" ";
            break;
        default:
            information = " no valid info";


    }

}

}