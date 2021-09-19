/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statement asking for the number of the month (IN METHOD)
// Use switch with a bunch of cases for each month and corresponding month name
// Set default to a variable that will be used in a ternary operator to print out an error or correct month name

package solution;

import java.util.Scanner;

public class Solution21
{
    private final Scanner in = new Scanner(System.in);

    private String month;
    private int monthNum;
    private int i = 0;
    private String output;

    private int getMonth(String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args)
    {
        Solution21 main = new Solution21();

        main.monthNum = main.getMonth("Please enter the number of the month: ");

        switch(main.monthNum)
        {
            case 1:
                main.month = "January";
                break;
            case 2:
                main.month = "February";
                break;
            case 3:
                main.month = "March";
                break;
            case 4:
                main.month = "April";
                break;
            case 5:
                main.month = "May";
                break;
            case 6:
                main.month = "June";
                break;
            case 7:
                main.month = "July";
                break;
            case 8:
                main.month = "August";
                break;
            case 9:
                main.month = "September";
                break;
            case 10:
                main.month = "October";
                break;
            case 11:
                main.month = "November";
                break;
            case 12:
                main.month = "December";
                break;

            default:
                main.i = 1;
        }

        main.output = (main.i == 0)
                ? "The name of the month is " + main.month + "."
                : "You have entered an invalid input.";

        System.out.println(main.output);

    }
}
