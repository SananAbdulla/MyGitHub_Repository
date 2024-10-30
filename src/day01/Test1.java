package day01;

public class Test1 {
    public static void main(String[] args) {

        int x =50;
        int y =20;
        int z =30;

        int sum= result(x,y,z);
        System.out.println(sum);
        System.out.println("x = " + x);
    }

    static int result (int x, int y, int z) {
        int sum  = x+y+z;
        return sum;



    }

}

