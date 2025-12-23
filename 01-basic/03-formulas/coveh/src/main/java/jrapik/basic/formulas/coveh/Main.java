package jrapik.basic.formulas.coveh;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int MINUTES_PER_HOUR = 60;
        Scanner s = new Scanner(System.in);
        float []x = {0, 0, 0};
        int n = 0;

        if (s.hasNextFloat())
            x[n++] = s.nextFloat();

        if (s.hasNextFloat())
            x[n++] = s.nextFloat();

        if (s.hasNextFloat())
            x[n++] = s.nextFloat();

        if (
            n == 3 && x[0] >= 0 && x[1] >= 0 && x[2] >= 0 &&
            (x[0] > 0 || x[1] > 0 || x[2] > 0)
        ) {
            double speed_kmh = (double)x[0] + x[1];
            double time_h = (double)x[2] / speed_kmh;
            double hours = Math.floor(time_h);
            double minutes = (time_h - hours) * MINUTES_PER_HOUR;

            System.out.println(
                "They will collide in " + Math.round(hours) + " hours and " +
                Math.round(minutes) + " minutes."
            );
        }
    }
}
