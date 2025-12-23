package jrapik.basic.formulas.cefah;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final float MULTIPLIER = 1.8f;
        final float CONSTANT = 32f;
        Scanner s = new Scanner(System.in);

        if (s.hasNextFloat()) {
            float cdeg = s.nextFloat();
            float fdeg = cdeg * MULTIPLIER + CONSTANT;

            System.out.println(fdeg);
        }
    }
}
