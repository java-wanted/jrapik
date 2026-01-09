package jrapik.branches.three.thres;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []ORDINAL = {
            "first", "second", "third",
        };
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 3 && x[0] != x[1] && x[0] != x[2] && x[1] != x[2]) {
            int idx = 0;

            for (int i = 1; i < x.length; ++i) {
                if (x[i] < x[idx])
                    idx = i;
            }

            System.out.printf("The %s numter is the smallest.\n", ORDINAL[idx]);
        }
    }
}
