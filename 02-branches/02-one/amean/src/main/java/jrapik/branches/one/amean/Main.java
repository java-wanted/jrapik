package jrapik.branches.one.amean;

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

        if (n == 2) {
            if (x[0] < 0)
                x[0] = -x[0];

            if (x[1] < 0)
                x[1] = -x[1];

            System.out.println((x[0] + x[1]) / 2f);
        }
    }
}
