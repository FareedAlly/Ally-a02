/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Use a for loop to record the quantity and price for the 3 products
// Calculate the subtotal, tax and total in 3 different methods
// Print results to 2 decimal places using formatting

package solution;

import java.util.Scanner;

public class Solution10
{



    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double subtotal = 0;
        final double tax = 1.055;
        for(int i = 1; i <= 3; i++)
        {
            System.out.print("Enter the price of item "+ i + ": ");
            double price = in.nextDouble();

            System.out.print("Enter the quantity of item " + i + ": ");
            int quantity = in.nextInt();

            subtotal += quantity * price;
        }

        double total = subtotal * tax;
        total = total * 100;
        total = Math.round(total);
        total = total / 100;

        System.out.println( "Subtotal: $"+  String.format("%.2f", subtotal));
        System.out.println( "Tax: $" + String.format("%.2f", total - subtotal));
        System.out.println( "Total: $" + String.format("%.2f", total));
    }
}
