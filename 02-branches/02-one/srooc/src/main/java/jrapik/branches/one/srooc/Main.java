package jrapik.branches.one.srooc;

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

        if (n == 2 && x[0] > 0 && x[1] >= 0) {
            if (x[1] < x[0] * x[0])
                System.out.println(x[1] * 5);
        }
    }
}
