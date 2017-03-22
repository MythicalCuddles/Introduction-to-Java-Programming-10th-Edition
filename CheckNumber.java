import java.util.Scanner;

public class CheckNumber {
    /*****************************************************
     Filename: 		    CheckNumber
     Created by: 		Melissa B.
     Created on: 		22 March 2017
     Comment: 		    Check to see if a number is ODD or EVEN
     ******************************************************/

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(number % 2 == 0)
        {
            System.out.println("The number " + number + " is even.");
        }
        else
        {
            System.out.println("The number " + number + " is odd.");
        }
    }
}
