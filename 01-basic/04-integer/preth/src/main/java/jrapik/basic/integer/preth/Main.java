package jrapik.basic.integer.preth;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int BASE = 10;
        final int MIN = 100;
        final int MAX = 999;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= MIN && x[0] <= MAX) {
            int v = x[0];
            int r = 0;
            int i = 0;

            for (; i < 2; ++i, v /= BASE)
                r = (r * BASE) + v % BASE;

            while (i-- > 0)
                v *= BASE;

            r += v;

            System.out.println(r);
        }
    }
}
