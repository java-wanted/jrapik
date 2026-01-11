package jrapik.loops.counter.conum;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        if (s.hasNextInt())
            System.out.print(s.nextInt());

        while (s.hasNextInt()) {
            System.out.print(" " + s.nextInt());
        }

        System.out.println();
    }
}
