package jrapik.basic.formulas.sweet;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        Scanner s = new Scanner(System.in);
        int []c = {340, 230, 98};
        int []x = {0, 0, 0};
        int n = 0;

        if (s.hasNextInt())
            x[n++] = s.nextInt();
        if (s.hasNextInt())
            x[n++] = s.nextInt();
        if (s.hasNextInt())
            x[n++] = s.nextInt();

        if (n == 3 && x[0] >= 0 && x[1] >= 0 && x[2] >= 0) {
            System.out.println(
                c[0] * x[0] + c[1] * x[1] + c[2] * x[2]
            );
        }
    }
}
