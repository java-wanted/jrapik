package jrapik.branches.two.disix;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int BASE = 10;
        final int MIN = 100;
        final int MAX = 999;
        final int DIG = 6;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= MIN && x[0] <= MAX) {
            int v = x[0];
            boolean c = false;

            for (; !c && v != 0; v /= BASE)
                c = (v % BASE) == DIG;

            if (c) {
                System.out.printf("The number contains the digit %d.\n", DIG);
            } else {
                System.out.printf(
                    "The number does not contain the digit %d.\n", DIG
                );
            }
        }
    }
}
