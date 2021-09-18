/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statement asking for how many euros and exchange rate (IN METHOD)
// Convert from euros to usd (IN METHOD)
// Print final statement

package solution;

import java.util.Scanner;

public class Solution11
{
    private final Scanner in = new Scanner(System.in);

    private double rate;
    private double c_to;
    private double euros;

    private double input(String prompt)
    {
        System.out.println(prompt);

         return in.nextDouble();
    }

    private double exchange(double rate, double euros)
    {
        return (rate * euros) + 0.01;
    }

    public static void main(String[] args)
    {
        Solution11 main = new Solution11();

        main.euros = main.input("How many euros are you exchanging? ");
        main.rate = main.input("What is the exchange rate? ");

        main.c_to = main.exchange(main.rate, main.euros);

        System.out.printf("%.2f euros at an exchange rate of %.4f is %n %.2f U.S. dollars.%n", main.euros, main.rate, main.c_to);

    }
}
