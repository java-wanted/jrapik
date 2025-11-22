package jrapik.basic.output.ionam;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");

        if (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}
