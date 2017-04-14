import java.util.Scanner;

/**
 * Created by Melissa on 14/04/2017.
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for a radius: ");
        double radius = input.nextDouble();

        // Compute Area
        double area = radius * radius * PI;

        // Display Result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
