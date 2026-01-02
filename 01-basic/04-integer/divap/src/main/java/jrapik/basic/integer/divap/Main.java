package jrapik.basic.integer.divap;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 2 && x[0] >= 0 && x[1] >= 0) {
            int left = x[1];
            int count = 0;
            
            if (x[0] > 0) {
                count = left / x[0];
                left = left % x[0];
            }

            System.out.printf(
                "Give each student %d, left apples in backed - %d\n",
                count, left
            );
        }
    }
}
