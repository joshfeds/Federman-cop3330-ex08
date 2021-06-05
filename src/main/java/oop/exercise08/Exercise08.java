package oop.exercise08;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise08
{
    static Scanner input = new Scanner(System.in);
    public static int peopleCount() {
        System.out.print("How many people? ");
        return input.nextInt();
    }
    public static int pizzaCount() {
        System.out.print("How many pizzas? ");
        return input.nextInt();
    }
    public static int sliceCount() {
        System.out.print("How many slices? ");
        return input.nextInt();
    }
    public static void splitPizza(int people, int pizzas, int slices) {
        int totalSlices = pizzas * slices;
        int slicesEach = totalSlices / people;
        int leftover = totalSlices % people;

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza\n", slicesEach);
        System.out.printf("There are %d leftovers", leftover);
    }
    public static void main( String[] args ) {
        int people = peopleCount();
        int pizzas = pizzaCount();
        int slices = sliceCount();
        splitPizza(people, pizzas, slices);
    }
}
