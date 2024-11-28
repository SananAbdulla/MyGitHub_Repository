package day14_String;

public class DailyPractice {
    public static void main(String[] args) {




        int num = 1000;

        System.out.println((num + "").length());



        String str = "Loopcamp";
        String str2 = "LOOp";

        System.out.println(str.equalsIgnoreCase("LOOpcamp"));
        System.out.println(str.toLowerCase().startsWith("loop".toLowerCase()));

    }
}
