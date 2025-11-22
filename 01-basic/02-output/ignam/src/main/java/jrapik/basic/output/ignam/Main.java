package jrapik.basic.output.ignam;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        if (s.hasNextLine()) {
            System.out.println(
                "Hello, " + s.nextLine() + "!"
            );
        }
    }
}
