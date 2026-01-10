package jrapik.branches.several.seyea;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []SEASONS = {
            "winter", "spring", "summer", "autumn",
        };
        final int MONTH_COUNT = 12;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 1 && x[0] <= MONTH_COUNT) {
            int i = (x[0] % MONTH_COUNT) / (MONTH_COUNT / SEASONS.length);

            System.out.printf("It is %s.\n", SEASONS[i]);
        }
    }
}
