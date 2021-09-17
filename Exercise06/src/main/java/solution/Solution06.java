/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking what current age and when they would like to retire and scan them (IN METHOD)
// Calculate how many years left until retirement
// Print statement telling what year they can retire


package solution;

import java.util.Scanner;
import java.util.Calendar;

public class Solution06
{
    private static final Scanner in = new Scanner(System.in);

    private int currentAge;
    private int retirementAge;
    private int yearsLeft;

    private int age(String prompt)
    {
       System.out.println(prompt);
       return in.nextInt();
    }

    private int yearsUntilRetirement(int retirementAge, int currentAge)
    {
        return retirementAge - currentAge;
    }

    public static void main(String[] args)
    {
        Solution06 main = new Solution06();

        main.currentAge = main.age("What is your current age? ");
        main.retirementAge = main.age("At what age would you like to retire? ");

        main.yearsLeft = main.yearsUntilRetirement(main.retirementAge, main.currentAge);

        System.out.println("You have " + main.yearsLeft + " years left until you can retire.");

        Calendar cal = Calendar.getInstance();

        System.out.println("It's " +  cal.get(Calendar.YEAR) + " so you can retire in " + (cal.get(Calendar.YEAR) + main.yearsLeft));


    }
}
