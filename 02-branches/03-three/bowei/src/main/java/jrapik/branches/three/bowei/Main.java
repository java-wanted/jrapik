package jrapik.branches.three.bowei;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final float LIGHT = 60;
        final float LIGHT_WELTER = 64;
        final float WELTER = 69;
        Scanner s = new Scanner(System.in);
        float []x = {0};
        int n = 0;

        if (s.hasNextFloat())
            x[n++] = s.nextFloat();

        if (n == 1) {
            if (x[0] < LIGHT)
                System.out.println("Her weight is light.");
            else if (x[0] < LIGHT_WELTER)
                System.out.println("Her weight is light welter.");
            else if (x[0] < WELTER)
                System.out.println("Her weight is welter.");
        }
    }
}
