package jrapik.branches.three.prosm;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 3) {
            int []l = {x[0], 0};

            if (x[1] < l[0]) {
                l[1] = l[0];
                l[0] = x[1];
            } else {
                l[1] = x[1];
            }

            if (x[2] < l[0]) {
                l[1] = l[0];
                l[0] = x[2];
             } else if (x[2] < l[1]) {
                l[1] = x[2];
            }

            System.out.println((long)l[0] * l[1]);
        }
    }
}
