import java.util.Scanner;

public class Circle {
    /*****************************************************
     Filename: 		    Circle
     Created by: 		Melissa B.
     Created on: 		01 March 2017
     Comment: 		    Work out values of a circle with user input as radius
     ******************************************************/

    public static void main(String[] args)
    {
        // Declaring Variables
        final double PI = 3.141592653589793;
        double radius, area, circumference, diameter;

        Scanner input = new Scanner(System.in); // Create an instance of the Scanner Class

        System.out.println("Enter radius of circle:"); // Print message to screen
        radius = input.nextDouble(); // Ask for input and store into radius int
        System.out.println(""); // Skip two lines

        System.out.println("---- Your Circle ----");

        area = PI * (radius * radius); // Work out area using constant value and input value
        System.out.println("Area: " + area); // Print area to screen

        circumference = 2 * PI * radius;
        System.out.println("C: " + circumference); // Print circumference to screen

        diameter = 2 * radius;
        System.out.println("d: " + diameter);

        System.out.println("\n"); // Skip two lines
    }
}
