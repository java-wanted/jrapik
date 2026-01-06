package jrapik.branches.one.abmax;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0};
        int n = 0;

        if (s.hasNextFloat()) {
            x[n++] = s.nextFloat();
        }

        if (n == 1) {
            float v = x[0];

            if (v < 0)
                v = -v;

            System.out.println(v);
        }
    }
}
