package jrapik.branches.two.gredi;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final int BASE = 10;
        final int MIN = 100;
        final int MAX = 999;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt()) {
            x[n++] = s.nextInt();
        }

        if (n == 1 && x[0] >= MIN && x[0] <= MAX) {
            int last = x[0] % BASE;
            int first = x[0] / BASE / BASE;

            if (first > last)
                System.out.println("The first digit is greater.");
            else if (last > first)
                System.out.println("The last digit is greater.");
        }
    }
}
