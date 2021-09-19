/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statement asking for age (IN METHOD)
// Use ternary operator to check if entered age is >= legal age
// if true, print ok statement, if false, print no statement

package solution;

import java.util.Scanner;

public class Solution16
{
    private final Scanner in = new Scanner(System.in);

    private int minimumAge = 16;
    private int userAge;
    private  String output;

    private int input(String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args)
    {
        Solution16 main = new Solution16();

        main.userAge = main.input("What is your age? ");

        main.output = (main.userAge >= main.minimumAge)
                ? "You are old enough to legally drive. "
                : "You are not old enough to legally drive. ";

        System.out.println(main.output);

    }
}
