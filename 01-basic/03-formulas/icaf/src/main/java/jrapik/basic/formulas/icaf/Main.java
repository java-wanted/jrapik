package jrapik.basic.formulas.icaf;

import java.util.Scanner;

public class Main
{
    static interface IFI {
        public int y(int x);
    }

    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        IFI f = (x) -> (17 * x - 6) * x + 13;

        if (s.hasNextInt()) {
            System.out.println(f.y(s.nextInt()));
        }
    }
}
