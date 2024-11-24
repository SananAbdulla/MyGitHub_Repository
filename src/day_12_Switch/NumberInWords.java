package day_12_Switch;

import java.lang.invoke.SwitchPoint;

public class NumberInWords {
    public static void main(String[] args) {

  /*
      Take a number and print the number as the word version
      1 ====> one
      2 ====> two
   */

        int num = 1;   // 1 - 5  ------ it is not in the range of 1-5

        // Option 1. with if statement

//       if (num >= 1 && num <=5) {
//            if (num == 1) {
//               System.out.println("one");
//           }
//        else if (num == 2) {
//               System.out.println("two");
//           }
//       else if (num == 3) {
//               System.out.println("three");
//           }
//        else if (num == 4) {
//               System.out.println("four");
//           }
//       else  {
//               System.out.println("five");
//           }
//       }
//       else {
//           System.out.println("t is not in the range of 1-5");
//       }

        // Option 2. with switch statement


        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Not in this range");
        }
        }
    }