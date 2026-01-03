package jrapik.branches.two.cifit;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int MINUTES_PER_HOUR = 60;
        final int KILO = 1000;
        Scanner s = new Scanner(System.in);
        float []x = {0, 0};
        int n = 0;

        if (s.hasNextFloat()) {
            x[n++] = s.nextFloat();
        }

        if (s.hasNextFloat()) {
            x[n++] = s.nextFloat();
        }

        if (n == 2) {
            float cir_s = x[1];
            float tri_s = x[0];

            double cir_r2 = cir_s / Math.PI;
            double tri_a2 = 4 * tri_s / Math.sqrt(3);
            double tri_r2 = tri_a2 / 12;

            if (cir_r2 <= tri_r2)
                System.out.printf("It fits.\n");
            else
                System.out.printf("It does not fit.\n");
        }
    }
}
