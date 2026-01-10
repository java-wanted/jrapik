package jrapik.branches.several.dawee;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []WEEK_DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday",
        };
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 1 && x[0] <= 7) {
            System.out.printf("It is %s.\n", WEEK_DAYS[x[0] - 1]);
        }
    }
}
