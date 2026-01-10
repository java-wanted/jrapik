package jrapik.branches.three.caqua;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        float []x = {0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextFloat())
                x[n++] = s.nextFloat();
        }

        if (n == 2 && x[0] != 0 && x[1] != 0) {
            int q = 0;

            if (x[1] < 0)
                q = x[0] < 0 ? 3 : 4;
            else
                q = x[0] < 0 ? 2 : 1;

            System.out.printf("It is in quadrant %d.\n", q);
        }
    }
}
