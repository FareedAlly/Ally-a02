/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statements asking for amount of people, how many pizzas, and how many slices are in the pizza (IN METHOD)
// Divide to calculate how many slices each person gets (IN METHOD)
// Use mod operator to calculate remainder?


package solution;

import java.util.Scanner;

public class Solution08
{
    private final Scanner in = new Scanner(System.in);

    private int people;
    private int pizzas;
    private int slicesPerPizza;
    private int slicesPer;
    private int slicesLeft;

    private int input (String prompt)
    {
        System.out.println(prompt);
        return in.nextInt();
    }

    private int slicesPerPerson (int people, int pizzas, int slicesPerPizza)
    {

        return (slicesPerPizza * pizzas) / people;
    }

    private int remainingSlices (int slicesPer, int pizzas, int slicesPerPizza)
    {

        return (pizzas * slicesPerPizza) % slicesPer;
    }

    public static void main(String[] args)
    {
        Solution08 main = new Solution08();

        main.people = main.input("How many people? ");
        main.pizzas = main.input("How many pizzas do you have? ");
        main.slicesPerPizza = main.input("How many slices for per pizza? ");

        System.out.println(main.people + " people with " + main.pizzas + " pizzas (" + (main.slicesPerPizza * main.pizzas) + " slices)");

        main.slicesPer = main.slicesPerPerson(main.people, main.pizzas, main.slicesPerPizza);

        System.out.println("Each person gets " + main.slicesPer + " pieces of pizza.");

        main.slicesLeft = main.remainingSlices(main.slicesPer, main.pizzas, main.slicesPerPizza);

        System.out.println("There are " + main.slicesLeft + " leftover pieces.");
    }
}
