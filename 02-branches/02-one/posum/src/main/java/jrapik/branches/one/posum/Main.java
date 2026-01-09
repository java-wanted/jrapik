package jrapik.branches.one.posum;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == x.length) {
            System.out.println(
                Arrays.stream(x).filter((v) -> v > 0).sum()
            );
        }
    }
}
