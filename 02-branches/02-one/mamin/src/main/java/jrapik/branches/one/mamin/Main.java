package jrapik.branches.one.mamin;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0, 0};
        int n = 0;

        if (s.hasNextFloat()) {
            x[n++] = s.nextFloat();
        }

        if (s.hasNextFloat()) {
            x[n++] = s.nextFloat();
        }

        if (n == 2 && x[0] != x[1]) {
            float vmin = x[0];
            float vmax = x[1];

            if (vmin > vmax) {
                vmin = x[1];
                vmax = x[0];
            }

            System.out.printf("%s is greater than %s.\n", vmax, vmin);
            System.out.printf("%s is lesser than %s.\n", vmin, vmax);
        }
    }
}
