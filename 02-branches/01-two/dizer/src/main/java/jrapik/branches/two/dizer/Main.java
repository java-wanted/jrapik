package jrapik.branches.two.dizer;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 2 && x[1] != 0) {
            if (x[0] % x[1] == 0) {
                System.out.printf("The quotient is %d\n", x[0] / x[1]);
            } else {
                System.out.printf(
                    "%d is not divisible by %d without a remainder\n",
                    x[0], x[1]
                );
            }
        }
    }
}
