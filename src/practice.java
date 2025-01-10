import java.util.Arrays;

public class practice {
    public static void main(String[] args) {


        int [] [] num = {
                {1, 3, 5, 6},
                {5, 6, 7, 3}
        };

        for (int i = 0; i < num.length; i++) {
           // System.out.println(Arrays.toString(num[i]));
            for (int j = num[i].length -1; j >=0 ; j = j-1) {
                System.out.println(num [i] [j]);

            }

        }
    }
}
