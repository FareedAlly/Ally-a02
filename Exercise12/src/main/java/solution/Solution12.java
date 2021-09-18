/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for the information (IN METHOD)
// Calculate the true investment using the formaula (IN METHOD)
// Print results

package solution;

import java.util.Scanner;

public class Solution12
{
    private final Scanner in = new Scanner(System.in);

    private int principal;
    private double rate;
    private int years;
    private double investment;

    private double investmentCalculation (int principal, int years, double rate)
    {
        return principal * (years * (rate / 100)) + principal;
    }

    private int input (String prompt)
    {
        System.out.println(prompt);

        return in.nextInt();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Solution12 main = new Solution12();

        main.principal = main.input("Enter the principal: ");

        System.out.println("Enter the rate of interest: ");
        main.rate = in.nextDouble();

        main.years = main.input("Enter the number of years: ");

        main.investment = main.investmentCalculation(main.principal, main.years, main.rate);

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.%n", main.years, main.rate, main.investment);

    }

}
