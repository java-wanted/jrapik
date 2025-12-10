package jrapik.basic.formulas.tmage;

import java.util.Scanner;

public class Main
{
    static enum Comp {
        MONITOR, SYSTEM, KEYBOARD, MOUSE
    };

    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 2 && x[0] >= 0 && x[1] >= 0) {
            long m = ((long)x[0] + x[1]) / 2;
            System.out.printf(
                "The mean %d, difference for Tany %d, for Mity %d\n",
               m, x[0] - m, x[1] - m
            );
        }
    }
}
