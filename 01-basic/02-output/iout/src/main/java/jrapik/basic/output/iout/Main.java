package jrapik.basic.output.iout;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        if (s.hasNextInt()) {
            System.out.println(
                "You entered the number " + s.nextInt()
            );
        }
    }
}
