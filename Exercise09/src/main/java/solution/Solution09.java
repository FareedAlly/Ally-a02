/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for dimensions of room (IN METHOD)
// Calculate how much gallons of paint needed, use if statement to check if there is remainder then add 1 (IN METHOD)

package solution;

import java.util.Scanner;

public class Solution09
{
    private final Scanner in = new Scanner(System.in);

    private int length;
    private int width;
    private int constant = 350;
    private int gallonsOfPaint;

    private int input (String prompt)
    {
        System.out.println(prompt);

        return in.nextInt();
    }

    private int amountOfGallons (int length, int width, int constant)
    {
        int gallons = (length * width) % constant;

        if (gallons == 0)
        {
            return (length * width) / constant;
        }

        else
        {
            return ((length * width) / constant) + 1;
        }

    }

    public static void main(String[] args)
    {
        Solution09 main = new Solution09();

        main.length = main.input("Enter the length of the room: ");
        main.width = main.input("Enter the width of the room: ");

        main.gallonsOfPaint = main.amountOfGallons(main.length, main.width, main.constant);

        System.out.println("You will need to purchase " + main.gallonsOfPaint + " gallons of paint to cover " + (main.length * main.width) + " square feet.");
    }
}
