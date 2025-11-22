package jrapik.basic.output.tnum;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []fi = {100, 1949};
        int []se = {0, 0};
        int c = 0;

        if (s.hasNextInt())
            se[c++] = s.nextInt();
        if (s.hasNextInt())
            se[c++] = s.nextInt();

        if (c == se.length) {
            System.out.println(fi[0] + " " + se[0]);
            System.out.println(fi[1] + " " + se[1]);
        }
    }
}
