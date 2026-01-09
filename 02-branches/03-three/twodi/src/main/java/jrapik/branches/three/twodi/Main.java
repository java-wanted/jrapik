package jrapik.branches.three.twodi;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 2 && x[0] != x[1]) {
            if ((x[1] % x[0]) == 0) {
                System.out.printf("%d is a divisor %d.\n", x[0], x[1]);
            } else if ((x[0] % x[1]) == 0) {
                System.out.printf("%d is a divisor %d.\n", x[1], x[0]);
            } else {
                System.out.printf(
                    "No one of the numbers is a divisor on the other.\n"
                );
            }
        }
    }
}
