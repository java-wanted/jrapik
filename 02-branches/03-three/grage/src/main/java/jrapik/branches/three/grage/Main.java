package jrapik.branches.three.grage;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (n == 2) {
            if (x[0] > x[1])
                System.out.println("Mity is older than Vasy.");
            else if (x[1] > x[0])
                System.out.println("Vasy is older than Mity.");
            else
                System.out.println("They are the same age.");
        }
    }
}
