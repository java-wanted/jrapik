package jrapik.branches.several.canam;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []NAMES = {
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace",
        };
        final int FIRST = 6;
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= FIRST && x[0] < FIRST + NAMES.length) {
            System.out.printf("It is a %s.\n", NAMES[x[0] - FIRST]);
        }
    }
}
