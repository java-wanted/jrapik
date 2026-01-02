package jrapik.basic.integer.dahou;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int SECONDS = 60;
        final int MINUTES = 60;
        final int SECONDS_PER_HOUR = SECONDS * MINUTES;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= 0) {
            int hours = x[0] / SECONDS_PER_HOUR;

            System.out.println(hours);
        }
    }
}
