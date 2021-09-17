/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements to find dimensions of room and store the scanned values (IN METHOD)
// Find the area (IN METHOD)
// Convert to square meters (IN METHOD)

package solution;

import java.util.Scanner;

public class Solution07
{
    private static final Scanner in = new Scanner(System.in);

    private int length;
    private int width;
    private String area;
    private String areaM;

    private int dimensions(String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    private String areaInFt(int length, int width)
    {
        String temp;

        temp = ((length * width) + " square feet");

        return temp;
    }

    private String areaInMeters(double metersSquared)
    {
        String temp;

        temp = (metersSquared + " square meters");

        return temp;
    }

    public static void main(String[] args)
    {
        Solution07 main = new Solution07();



        main.length = main.dimensions("What is the length of the room in feet? ");
        main.width = main.dimensions("What is the width of the room in feet? ");

        System.out.println("You entered the dimensions of " + main.length + " feet by " + main.width + " feet.");

        System.out.println("The area is ");

        main.area = main.areaInFt(main.length, main.width);
        System.out.println(main.area);

        double metersSquared = (main.length * main.width) *  0.09290304;

        main.areaM = main.areaInMeters(metersSquared);
        System.out.println(main.areaM);
    }
}
