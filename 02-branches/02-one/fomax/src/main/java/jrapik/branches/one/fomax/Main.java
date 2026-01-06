package jrapik.branches.one.fomax;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0, 0, 0, 0};
        int n = 0;
        boolean equals = false;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextFloat())
                x[n++] = s.nextFloat();
        }

        if (n == 4) {
            float vmax = x[0];

            for (int i = 1; i < n; ++i) {
                if (x[i] > vmax)
                    vmax = x[i];
            }

            System.out.printf("%s is the greatest number.\n", vmax);
        }
    }
}
