/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for c or f, then store the response (IN METHOD)
// Use if statements to calculate either c or f, and check for uppercase or lowercase (IN METHOD)

package solution;

import java.util.Scanner;

public class Solution18
{
    private final Scanner in = new Scanner(System.in);

    private String input;
    private double cTemp;
    private double fTemp;

    private String cOrF (String prompt)
    {
        System.out.println(prompt);
        return in.next();
    }

    private double fToC()
    {
        System.out.println("Please enter the temperature in Fahrenheit: ");

        double temp = in.nextDouble();

        return ((temp - 32) * 5) / 9;
    }

    private double cToF()
    {
        System.out.println("Please enter the temperature in Celsius: ");

        double temp = in.nextDouble();

        return ((temp * 9) / 5) + 32;

    }

    public static void main(String[] args)
    {
        Solution18 main = new Solution18();

        main.input = main.cOrF("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.");

        System.out.println("Your choice: " + main.input);

        if(main.input.equals("C") || main.input.equals("c"))
        {
            main.cTemp = main.fToC();
            System.out.printf("The temperature in Celsius is %.2f.", main.cTemp);
        }

        else if(main.input.equals("F") || main.input.equals("f"))
        {
            main.fTemp = main.cToF();
            System.out.printf("The temperature in Fahrenheit is %.2f.", main.fTemp);
        }

    }
}
