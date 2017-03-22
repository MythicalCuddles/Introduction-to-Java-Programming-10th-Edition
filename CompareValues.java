import java.util.Scanner;

public class CompareValues {
    /*****************************************************
     Filename: 		    CompareValues
     Created by: 		Melissa B.
     Created on: 		22 March 2017
     Comment: 		    Compares two integers and prints information about them
     ******************************************************/

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        System.out.println("Enter another number: ");
        int number2 = input.nextInt();

        if(number1 > number2)
        {
            System.out.println(number1 + " is larger than " + number2);
        }
        else if(number1 < number2)
        {
            System.out.println(number2 + " is larger than " + number1);
        }
        else
        {
            System.out.println("Number 1 (" + number1 + ") is the same as Number 2 (" + number2 + ")");
        }
    }
}
