package jrapik.branches.two.trali;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int MINUTES_PER_HOUR = 60;
        final int GREEN = 3;
        final int RED = 2;
        final int PERIOD = GREEN + RED;
        final String TAG = "Clock";
        Scanner s = new Scanner(System.in);
        float []x = {0};
        int n = 0;

        if (!s.hasNext() || !s.next().equals(TAG))
            ;
        else if (s.hasNextFloat())
            x[n++] = s.nextFloat();

        if (n == 1 && x[0] >= 0) {
            float offs = x[0] % PERIOD;

            if (offs > 0 && offs <= GREEN)
                System.out.println("The green light is on.");
            else
                System.out.println("The red light is on.");
        }
    }
}
