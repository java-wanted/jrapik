package jrapik.branches.several.casui;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []NAMES = {
            "spade", "club", "diamond", "heart",
        };
        Scanner s = new Scanner(System.in);
        int []x = {0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 1 && x[0] >= 1 && x[0] <= NAMES.length) {
            System.out.printf("It is %s suit.\n", NAMES[x[0] - 1]);
        }
    }
}
