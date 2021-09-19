<<<<<<< HEAD
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for all the info (IN METHOD)
// Use if statements to get the right r value depending on male or female
// Calculate BAC (IN METHOD)
// use if statements to print whether it is legal or not to drive

package solution;

import java.util.Scanner;

public class Solution17
{
    private final Scanner in = new Scanner(System.in);

    private double maxBAC = 0.08;
    private double menR = 0.73;
    private double womenR = 0.66;
    private double r = 0;
    private double weight;
    private double gender;
    private double ounces;
    private double hours;
    private double userBAC;

    private double input (String prompt)
    {
        System.out.println(prompt);
        return in.nextDouble();
    }

    private double bac (double ounces, double weight, double r, double hours)
    {
        return (ounces * 5.14/ weight * r) - 0.015 * hours;
    }

    public static void main(String[] args)
    {
        Solution17 main = new Solution17();

        main.gender = main.input("Enter a 1 if you are male or a 2 if you are female: ");

        while(main.r == 0)
        {
            if(main.gender == 1)
            {
                main.r = main.menR;
            }

            else if(main.gender == 2)
            {
                main.r = main.womenR;
            }

            else
            {
                main.gender =main.input("You must enter 1 or 2 for the gender. ");

            }
        }

        main.ounces = main.input("How many ounces of alcohol did you have? ");
        main.weight = main.input("What is your weight, in pounds? ");
        main.hours = main.input("How many hours has it been since your last drink? ");

        main.userBAC = main.bac(main.ounces, main.weight, main.r, main.hours);

        System.out.println("Your BAC is " + main.userBAC);

        if(main.userBAC <= main.maxBAC)
        {
            System.out.println("It is legal for you to drive. ");
        }
        else
        {
            System.out.println("It is not legal for you to drive. ");
        }



    }
}
=======
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for all the info (IN METHOD)
// Use if statements to get the right r value depending on male or female
// Calculate BAC (IN METHOD)
// use if statements to print whether it is legal or not to drive

package solution;

import java.util.Scanner;

public class Solution17
{
    private final Scanner in = new Scanner(System.in);

    private double maxBAC = 0.08;
    private double menR = 0.73;
    private double womenR = 0.66;
    private double r = 0;
    private double weight;
    private double gender;
    private double ounces;
    private double hours;
    private double userBAC;

    private double input (String prompt)
    {
        System.out.println(prompt);
        return in.nextDouble();
    }

    private double bac (double ounces, double weight, double r, double hours)
    {
        return (ounces * 5.14/ weight * r) - 0.015 * hours;
    }

    public static void main(String[] args)
    {
        Solution17 main = new Solution17();

        main.gender = main.input("Enter a 1 if you are male or a 2 if you are female: ");

        while(main.r == 0)
        {
            if(main.gender == 1)
            {
                main.r = main.menR;
            }

            else if(main.gender == 2)
            {
                main.r = main.womenR;
            }

            else
            {
                main.gender =main.input("You must enter 1 or 2 for the gender. ");

            }
        }

        main.ounces = main.input("How many ounces of alcohol did you have? ");
        main.weight = main.input("What is your weight, in pounds? ");
        main.hours = main.input("How many hours has it been since your last drink? ");

        main.userBAC = main.bac(main.ounces, main.weight, main.r, main.hours);

        System.out.println("Your BAC is " + main.userBAC);

        if(main.userBAC <= main.maxBAC)
        {
            System.out.println("It is legal for you to drive. ");
        }
        else
        {
            System.out.println("It is not legal for you to drive. ");
        }



    }
}
>>>>>>> 7c476d894d0062824735a1a32c3bd314a59773e0
