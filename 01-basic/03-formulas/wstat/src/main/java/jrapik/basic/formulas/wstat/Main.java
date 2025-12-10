package jrapik.basic.formulas.wstat;

import java.util.Scanner;
import java.util.Map;

public class Main
{
    static enum Comp {
        MONITOR, SYSTEM, KEYBOARD, MOUSE
    };

    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        Map<Comp, Integer> c = Map.of(
            Comp.MONITOR,   9000,
            Comp.SYSTEM,    50000,
            Comp.KEYBOARD,  3000,
            Comp.MOUSE,     1500
        );
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 0) {
            long p = c.values().stream().reduce(0, (t, v) -> t += v);
            System.out.println(p * x[0]);
        }
    }
}
