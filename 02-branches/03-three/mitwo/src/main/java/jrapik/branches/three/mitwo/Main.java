package jrapik.branches.three.mitwo;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0, 0, 0, 0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextFloat())
                x[n++] = s.nextFloat();
        }

        if (n == 6) {
            if (x[1] < x[0]) {
                float t = x[0];
                x[0] = x[1];
                x[1] = t;
            }

            if (x[2] < x[0])
                x[1] = x[0];
            else if (x[2] < x[1])
                x[1] = x[2];

            if (x[4] < x[3]) {
                float t = x[3];
                x[3] = x[4];
                x[4] = t;
            }

            if (x[5] < x[3])
                x[4] = x[3];
            else if (x[5] < x[4])
                x[4] = x[5];

            System.out.println((x[1] + x[4]) / 2f);
        }
    }
}
