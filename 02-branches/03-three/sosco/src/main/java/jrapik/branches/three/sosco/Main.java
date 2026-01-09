package jrapik.branches.three.sosco;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []RESULT = {
            "Loss", "Draw", null, "Win",
        };
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1) {
            if (x[0] >= 0 && x[0] < RESULT.length && RESULT[x[0]] != null)
                System.out.println(RESULT[x[0]]);
        }
    }
}
