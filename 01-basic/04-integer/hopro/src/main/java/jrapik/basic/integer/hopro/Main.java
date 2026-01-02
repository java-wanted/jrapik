package jrapik.basic.integer.hopro;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int FLOORS = 5;
        final int TOTAL = 15;
        final int PER_FLOOR = TOTAL / FLOORS;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= 1 && x[0] <= TOTAL) {
            int floor = (x[0] - 1) / PER_FLOOR + 1;

            System.out.printf(
                "The floor is %d\n", floor
            );
        }
    }
}
