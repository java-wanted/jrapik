package jrapik.branches.two.imdis;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final float METERS_PER_FOOT = 0.3048f;
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
            float one = x[0] * KILO;
            float other = x[1] * METERS_PER_FOOT;

            if (one > other)
                System.out.printf("The distance in kilometers is greater.\n");
            else if (other > one)
                System.out.printf("The distance in foots is greater\n");
        }
    }
}
