package jrapik.branches.several.monen;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []MONTHS = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December",
        };
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 0) {
            System.out.printf("It is %s.\n", MONTHS[x[0] % MONTHS.length]);
        }
    }
}
