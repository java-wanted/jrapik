package jrapik.branches.three.sular;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextFloat())
                x[n++] = s.nextFloat();
        }

        if (n == 3) {
            float []l = {x[0], 0};

            if (x[1] > l[0]) {
                l[1] = l[0];
                l[0] = x[1];
            } else {
                l[1] = x[1];
            }

            if (x[2] > l[0]) {
                l[1] = l[0];
                l[0] = x[2];
             } else if (x[2] > l[1]) {
                l[1] = x[2];
            }

            System.out.printf("%.1\n", l[0] + l[1]);
        }
    }
}
