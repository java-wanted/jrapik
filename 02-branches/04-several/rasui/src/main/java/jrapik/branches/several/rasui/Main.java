package jrapik.branches.several.rasui;

import java.util.Scanner;

public class Main
{
    public static void main(String []argv)
    {
        final String []SUITS = {
            "spade", "club", "diamond", "heart",
        };
        final String []RANKS = {
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace",
        };
        final int FIRST_RANK = 6;
        Scanner s = new Scanner(System.in);
        int []x = {0, 0};
        int n = 0;

        for (int i = 0; i < x.length; ++i) {
            if (s.hasNextInt())
                x[n++] = s.nextInt();
        }

        if (
            n == 2 &&
            x[0] >= 1 && x[0] <= SUITS.length &&
            x[1] >= FIRST_RANK && x[1] < FIRST_RANK + RANKS.length
        ) {
            System.out.printf(
                "It is %s of %ss.\n", RANKS[x[1] - FIRST_RANK], SUITS[x[0] - 1]
            );
        }
    }
}
