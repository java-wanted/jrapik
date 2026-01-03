package jrapik.branches.two.mimaf;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
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
            int min = 0;
            int max = 1;

            if (x[1] < x[0]) {
                min = 1;
                max = 0;
            }

            System.out.printf("The maximum value is %s\n", x[max]);
            System.out.printf("The minimum value is %s\n", x[min]);
        }
    }
}
