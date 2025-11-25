package jrapik.basic.formulas.radi;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {
            int r = s.nextInt();
            if (r > 0)
                System.out.println(r + r);
        }
    }
}
