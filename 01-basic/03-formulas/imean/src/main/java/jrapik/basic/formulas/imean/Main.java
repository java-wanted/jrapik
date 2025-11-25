package jrapik.basic.formulas.imean;

import java.util.Scanner;

public class Main
{
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
            /* integer calculation */
            long m = ((long)x[0] + x[1]) / 2;
            long g = (long)Math.sqrt((long)x[0] * x[1]);

            System.out.println(
                (long)Math.rint(m) + " " + (long)Math.rint(g)
            );
        }
    }
}
