package jrapik.branches.two.mecom;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int MINUTES_PER_HOUR = 60;
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
            float kmh = x[0] * MINUTES_PER_HOUR / KILO;
            float ms = x[1];

            if (kmh > ms)
                System.out.printf("The speed in km/h is greater.\n");
            else if (ms > kmh)
                System.out.printf("The speed in m/s is greater\n");
        }
    }
}
