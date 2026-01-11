package jrapik.branches.several.subel;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int LIMIT = 5;
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == x.length &&  x[0] > 0 && x[1] > 0) {
            long sum = 0;

            for (int v: x)
                sum += v <= LIMIT ? v : 0;

            System.out.println(sum);
        }
    }
}
