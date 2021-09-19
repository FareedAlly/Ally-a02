/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for username and passowrd (IN METHOD)
// Use if else statement to check if passowrd is correct
// If correct, print welcome statement, if incorrect print unknown user statement

package solution;

import java.util.Scanner;

public class Solution15
{
    private final Scanner in = new Scanner(System.in);

    private String password = "abc$123";
    private String username;
    private String enteredPass;

    private String input(String prompt)
    {
        System.out.println(prompt);
        return in.next();
    }

    public static void main(String[] args)
    {
        Solution15 main = new Solution15();

        main.username = main.input("What is your username? ");
        main.enteredPass = main.input("What is your password? ");

        if(main.enteredPass.equals(main.password))
        {
            System.out.println("Welcome " + main.username + " !");
        }
        else
        {
            System.out.println("I don't know you.");
        }



    }
}
