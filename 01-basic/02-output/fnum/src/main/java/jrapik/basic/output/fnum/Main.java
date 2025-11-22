package jrapik.basic.output.fnum;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        String d = "";
        int n = 4;

        while (n-- > 0 && s.hasNextInt()) {
            System.out.print(d + s.nextInt());
            d = " ";
        }

        System.out.println();
    }
}
