package jrapik.basic.output.pnum;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {
            int n = s.nextInt();

            System.out.println(
                "The next number after " + n + " is " + (n + 1)
            );
            System.out.println(
                "For the number " + n + ", the previous one is " + (n - 1)
            );
        }
    }
}
