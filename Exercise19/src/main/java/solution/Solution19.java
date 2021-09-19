/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for height and weight (IN METHOD)
// Use a loop to make sure that they enter a number
// Calculate BMI and use if statements to print whether or not they are healthy

package solution;

import java.util.Scanner;

public class Solution19
{
    private final Scanner in = new Scanner(System.in);

    private double lowerBMI = 18.5;
    private double upperBMI = 25;
    private double height;
    private double weight;
    private double bmi;

    private double input(String prompt)
    {
        System.out.printf(prompt);

        while(!in.hasNextDouble())
        {
            System.out.println("Please enter a number. ");
            in.nextLine();
        }
        return in.nextDouble();
    }

    public static void main(String[] args)
    {
        Solution19 main = new Solution19();

        main.height = main.input("Enter your height in inches: ");
        main.weight = main.input("Enter your weight in pounds: ");

        main.bmi = (main.weight / (main.height * main.height)) * 703;

        System.out.printf("Your BMI IS %.1f.", main.bmi);

        if(main.bmi < main.lowerBMI)
        {
            System.out.println("\nYou are underweight. You should see your doctor. ");
        }

        else if(main.bmi >= main.lowerBMI && main.bmi <= main.upperBMI)
        {
            System.out.println("\nYou are within the ideal weight range. ");
        }

        else
        {
            System.out.println("\nYou are overweight. You should see your doctor. ");
        }
    }
}
