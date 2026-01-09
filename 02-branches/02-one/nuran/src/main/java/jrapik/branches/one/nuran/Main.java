package jrapik.branches.one.nuran;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final float []RANGE = {1.6f, 3.8f};
        Scanner s = new Scanner(System.in);
        float []x = {0, 0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextFloat())
                x[n++] = s.nextFloat();
        }

        if (n == x.length) {
            StringBuilder b = new StringBuilder();

            for (int i = 0; i < x.length; ++i) {
                if (x[i] >= RANGE[0] && x[i] <= RANGE[1]) {
                    if (b.length() > 0)
                        b.append(" ");
                    b.append(Float.toString(x[i]));
                }
            }

            if (b.length() > 0) {
                System.out.println(b.toString());
            } else {
                System.out.println(
                    "None of the number are within the interval."
                );
            }
        }
    }
}
