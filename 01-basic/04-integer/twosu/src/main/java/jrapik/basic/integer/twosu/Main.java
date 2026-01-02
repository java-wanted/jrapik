package jrapik.basic.integer.twosu;

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
            int sum = x[0] % BASE + x[0] / BASE;

            System.out.println(sum);
        }
    }
}
