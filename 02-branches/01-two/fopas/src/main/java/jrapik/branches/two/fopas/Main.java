package jrapik.branches.two.fopas;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int BASE = 10;
        final int MIN = 1000;
        final int MAX = 9999;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= MIN && x[0] <= MAX) {
            int v = x[0];
            int last = 0;
            int first = 0;
            int i = 0;

            for (; i < 2; ++i, v /= BASE)
                last += v % BASE;

            for (; i < 4; ++i, v /= BASE)
                first += v % BASE;

            if (first == last) {
                System.out.println(
                    "The sum of the first two digits equals to " +
                    "the sum of two last."
                );
            } else {
                System.out.println(
                    "The sum of the first two digits does not equal to " +
                    "the sum of two last."
                );
            }
        }
    }
}
