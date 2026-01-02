package jrapik.basic.integer.twoun;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int BASE = 10;
        final int MIN = 10;
        final int MAX = 99;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= MIN && x[0] <= MAX) {
            int units = x[0] % BASE;
            int tens = x[0] / BASE;

            System.out.printf(
                "It contains %d tens and %d units\n", tens, units
            );
        }
    }
}
