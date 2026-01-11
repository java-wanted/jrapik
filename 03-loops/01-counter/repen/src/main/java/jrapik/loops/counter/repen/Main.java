package jrapik.loops.counter.repen;

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

        if (n == x.length) {
            if (x[1] > 0)
                System.out.print(x[0]);

            for (int i = 1; i < x[1]; ++i)
                System.out.print(" " + x[0]);

            System.out.println();
        }
    }
}
