/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statement asking for inputs (IN METHOD)
// Calculate total investment and print result

package solution;

import java.util.Scanner;

public class Solution13
{
    private final Scanner in = new Scanner(System.in);

    private int principal;
    private int years;
    private double compound;
    private double rate;
    private double investment;


    private int input (String prompt)
    {
        System.out.println(prompt);

        return in.nextInt();
    }



    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        Solution13 main = new Solution13();

        double temp;
        double temp1;
        double temp2;


        main.principal = main.input("What is the principal amount? ");

        System.out.println("What is the rate? ");
        main.rate = in.nextDouble();

        main.years = main.input("What is the number of years? ");

        main.compound = main.input("What is the number of times the interest is compounded per year? ");

        temp1 = 1 + ((main.rate/100)/main.compound);
        temp2 = main.compound*main.years;

        temp = Math.pow(temp1, temp2);
        main.investment = main.principal * temp;

        System.out.printf("%d invested at %.1f %%  for %d years compounded %f times per year is $ %.2f", main.principal, main.rate, main.years, main.compound, main.investment);



    }
}
