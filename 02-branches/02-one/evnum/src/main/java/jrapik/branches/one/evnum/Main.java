package jrapik.branches.one.evnum;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == x.length) {
            int count = 0;

            for (int i = 0; i < x.length; ++i) {
                if ((x[i] & 1) == 0)
                    ++count;
            }

            if (count > 0) {
                System.out.printf(
                    "The number of even numbers is %d.\n", count
                );
            } else {
                System.out.printf(
                    "There are no even numbers.\n"
                );
            }
        }
    }
}
