package jrapik.branches.several.damon;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int []MONTH_DAYS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
        };
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 1 && x[0] <= MONTH_DAYS.length) {
            System.out.printf("There are %d days.\n", MONTH_DAYS[x[0] - 1]);
        }
    }
}
