package jrapik.branches.several.yedaw;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []WEEK_DAYS = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday",
            "Sunday",
        };
        final int LAST_DAY = 365;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 1 && x[0] <= LAST_DAY) {
            System.out.printf(
                "It is %s.\n", WEEK_DAYS[(x[0] - 1) % WEEK_DAYS.length]
            );
        }
    }
}
