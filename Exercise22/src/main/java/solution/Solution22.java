/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Store all 3 numbers in seperate ints (IN METHOD)
// Use if statements to compare one value to the other two and print the largest one

package solution;

import java.util.Scanner;

public class Solution22
{
    private final Scanner in = new Scanner(System.in);

    private int first;
    private int second;
    private int third;
    private String largest = "The largest number is ";

    private int input(String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args)
    {
        Solution22 main = new Solution22();

        main.first = main.input("Enter the first number: ");
        main.second = main.input("Enter the second number: ");
        main.third = main.input("Enter the third number: ");

        if(main.first > main.second && main.first > main.third)
        {
            System.out.println(main.largest + main.first + ".");
        }
        else if(main.second > main.first && main.second > main.third)
        {
            System.out.println(main.largest + main.second + ".");
        }
        else
        {
            System.out.println(main.largest + main.third + ".");
        }

    }
}
