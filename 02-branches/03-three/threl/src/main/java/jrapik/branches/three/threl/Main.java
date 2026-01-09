package jrapik.branches.three.threl;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 3 && x[0] != x[1] && x[0] != x[2] && x[1] != x[2]) {
            int si = 0;
            int li = 0;

            for (int i = 1; i < x.length; ++i) {
                if (x[i] < x[si])
                    si = i;
                if (x[i] > x[li])
                    li = i;
            }

            System.out.printf("%d is the smallest.\n", x[si]);
            System.out.printf("%d is the largest.\n", x[li]);
        }
    }
}
