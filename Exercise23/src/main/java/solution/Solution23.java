/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Use a bunch of nested if else statements

package solution;

import java.util.Locale;
import java.util.Scanner;

public class Solution23
{
    private final Scanner in = new Scanner(System.in);

    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;

    private String input(String prompt)
    {
        System.out.println(prompt);
        return in.nextLine();
    }

    public static void main(String[] args)
    {
        Solution23 main = new Solution23();

        main.first = main.input("Is the car silent when you turn the key? ");

        if(main.first.toLowerCase(Locale.ROOT).equals("yes") || main.first.toLowerCase(Locale.ROOT).equals("y"))
        {
            main.second = main.input("Are the battery terminals corroded? ");

            if(main.second.toLowerCase(Locale.ROOT).equals("yes") || main.second.toLowerCase(Locale.ROOT).equals("y"))
            {
                System.out.println("Clean the terminals and try starting again. ");
            }
            else
            {
                System.out.println("Replace cables and try again. ");
            }
        }
        else
        {
            main.third = main.input("Does the car make a slicking noise? ");

            if(main.third.toLowerCase(Locale.ROOT).equals("yes") || main.third.toLowerCase(Locale.ROOT).equals("y"))
            {
                System.out.println("Replace the battery. ");
            }
            else
            {
                main.fourth = main.input("Does the car crank up but fail to start? ");

                if(main.fourth.toLowerCase(Locale.ROOT).equals("yes") || main.fourth.toLowerCase(Locale.ROOT).equals("y"))
                {
                    System.out.println("check your spark plug connections. ");
                }
                else
                {
                    main.fifth = main.input("Does the engine start and then die? ");

                    if(main.fifth.toLowerCase(Locale.ROOT).equals("yes") || main.fifth.toLowerCase(Locale.ROOT).equals("y"))
                    {
                        main.sixth = main.input("Does you car have fuel injection? ");

                        if(main.sixth.toLowerCase(Locale.ROOT).equals("yes") || main.sixth.toLowerCase(Locale.ROOT).equals("y"))
                        {
                            System.out.println("Get it in for service. ");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible. ");
                    }
                }
            }

        }
    }
}
