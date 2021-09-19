/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for order amount and state (IN METHOD)
// Use 1 if statement to check if string input for state is wi, if it is include tax, if not don't (IN METHOD)
// Print final statements 

package solution;

import java.util.Locale;
import java.util.Scanner;

public class Solution14
{
    private final Scanner in = new Scanner(System.in);

    private double wiTax = 5.5;
    private double tax = 0;
    private static String wi = "wi";
    private double order;
    private String state;

    private double orderInput(String prompt)
    {
        System.out.println(prompt);
        return in.nextDouble();
    }

    private String stateInput(String prompt)
    {
        System.out.println(prompt);
        return in.next();
    }

    private void wiOutput(double order, double tax)
    {
       System.out.printf("The subtotal is $%.2f %nThe tax is $%.2f.", order, tax);
    }

    public static void main(String[] args)
    {
        Solution14 main = new Solution14();

        main.order = main.orderInput("What is the order amount? ");
        main.state = main.stateInput("What is the state? ");

        if(wi.equals(main.state.toLowerCase(Locale.ROOT)))
        {
            main.tax = main.order * (main.wiTax/100);

            main.wiOutput(main.order, main.tax);
        }

        System.out.printf("%nThe total is $%.2f .", (main.order + main.tax));


    }
}
