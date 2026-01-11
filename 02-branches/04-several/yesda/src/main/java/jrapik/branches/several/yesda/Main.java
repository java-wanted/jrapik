package jrapik.branches.several.yesda;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int []MONTH_DAYS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
        };
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 2 &&  x[0] > 0 && x[1] > 0) {
            int m = x[1];
            int d = x[0];

            if (d > 1) {
                --d;
            } else {
                int pmi = (m + MONTH_DAYS.length - 2) % MONTH_DAYS.length;
                --m;
                d = MONTH_DAYS[pmi];
            }

            System.out.printf("The previous day is %d of %d.\n", d, m);
        }
    }
}
