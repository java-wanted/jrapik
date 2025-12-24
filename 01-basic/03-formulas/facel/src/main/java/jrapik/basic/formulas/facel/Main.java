package jrapik.basic.formulas.facel;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final float MULTIPLIER = 1.8f;
        final float CONSTANT = 32f;
        Scanner s = new Scanner(System.in);

        if (s.hasNextFloat()) {
            float fdeg = s.nextFloat();
            float cdeg = (fdeg - CONSTANT) / MULTIPLIER;

            System.out.println(Math.round(cdeg));
        }
    }
}
