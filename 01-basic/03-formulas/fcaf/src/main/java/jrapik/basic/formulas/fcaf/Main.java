package jrapik.basic.formulas.fcaf;

import java.util.Scanner;

public class Main
{
    static interface XFX {
        public double y(double x);
    }

    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        XFX f = (a) -> Math.sqrt(
            (2. * a + Math.sin(Math.abs(3. * a))) / 3.56
        );

        if (s.hasNextDouble()) {
            System.out.println(f.y(s.nextDouble()));
        }
    }
}
