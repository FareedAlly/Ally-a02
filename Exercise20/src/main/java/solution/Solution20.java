/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for order and state (IN METHOD)
// Use a bunch of if statements for state taxes, and within wi use a bunch of if statements for county tax
// Use a ternary operator with a variable to create a string based on true or false value
// Print string

package solution;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution20
{
    private final Scanner in = new Scanner(System.in);

    private double wiTax = 5;
    private double eauTax = 0.5;
    private double dunnTax = 0.4;
    private double ilTax = 8;
    private double tax;
    private double total;
    private int i = 0;
    private int order;
    private String state;
    private String county;
    private String output;
    private String ecc = "eau claire";

    private int orderInput(String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    private String stateInput(String prompt)
    {
        System.out.println(prompt);
        return in.next();
    }
    public static void main(String[] args)
    {
        Solution20 main = new Solution20();
        final Scanner in = new Scanner(System.in);

        main.order = main.orderInput("What is the order amount? ");
        main.state = main.stateInput("What state do you live in? ");

        if(main.state.toLowerCase(Locale.ROOT).equals("wi") || main.state.toLowerCase(Locale.ROOT).equals("wisconsin"))
        {
            System.out.println("What county do you live in? ");
            main.county = in.nextLine();

            if(main.ecc.equals(main.county.toLowerCase(Locale.ROOT)))
            {
                main.tax = main.order * ((main.wiTax + main.eauTax) / 100);
                main.total = main.order + main.tax;
            }
            else if (main.county.toLowerCase(Locale.ROOT).equals("dunn"))
            {
                main.tax = main.order * ((main.wiTax + main.dunnTax) / 100);
                main.total = main.order + main.tax;
            }
            else
            {
                main.tax = main.order * (main.wiTax / 100);
                main.total = main.order + main.tax;
            }
        }
        else if(main.state.toLowerCase(Locale.ROOT).equals("il") || main.state.toLowerCase(Locale.ROOT).equals("illinois"))
        {
            main.tax = main.order * (main.ilTax / 100);
            main.total = main.order + main.tax;
        }
        else
        {
            main.tax = 0;
            main.total = main.order;
            main.i = 1;
        }

        DecimalFormat two = new DecimalFormat("0.00");


        main.output = (main.i == 0)
            ? "The tax is $ " + two.format(main.tax) + ".\nThe total is $ " + two.format(main.total)
            : "The total is $ " + two.format(main.total) + ".";

        System.out.println(main.output);


    }
}
