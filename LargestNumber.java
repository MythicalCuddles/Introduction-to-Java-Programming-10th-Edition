import java.util.Scanner;

public class LargestNumber {
    /*****************************************************
     Filename: 		    LargestNumber
     Created by: 		Melissa B.
     Created on: 		22 March 2017
     Comment: 		    Prints the largest number from a list of numbers inputted
     ******************************************************/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number1 = input.nextInt();
        System.out.println("Please enter another number:");
        int number2 = input.nextInt();
        System.out.println("Please enter one last number:");
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3)
        {
            System.out.println("Number 1 with the value " + number1 + " is the largest number of the collection.");
        }
        else if(number2 > number1 && number2 > number3)
        {
            System.out.println("Number 2 with the value " + number2 + " is the largest number of the collection.");
        }
        else if(number3 > number1 && number3 > number2)
        {
            System.out.println("Number 3 with the value " + number3 + " is the largest number of the collection.");
        }
        else if(number1 == number2 && number2 == number3)
        {
            System.out.println("All of the numbers entered are the same value which is " + number1);
        }
        else {
            System.out.println("Entered values are not distinct");
        }
    }
}
