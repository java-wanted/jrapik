package jrapik.basic.integer.compa;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int COMPARTMENTS = 9;
        final int BERTH = 4;
        final int COUNT = COMPARTMENTS * BERTH;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= 1 && x[0] <= COUNT) {
            int compartment = (x[0] - 1) / BERTH + 1;

            System.out.printf(
                "Compartment is %d\n", compartment
            );
        }
    }
}
