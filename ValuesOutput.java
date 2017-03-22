import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by B00714027 on 22/03/2017.
 */
public class ValuesOutput {
    /*****************************************************
     Filename: 		    ValuesOutput
     Created by: 		Melissa B.
     Created on: 		01 March 2017
     Comment: 		    Takes input from the keyboard THREE integer values and enquires from the user if they wish to have the three values entered output in ascending or descending order
     ******************************************************/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number1 = input.nextInt();
        System.out.println("Please enter another number:");
        int number2 = input.nextInt();
        System.out.println("Please enter one last number:");
        int number3 = input.nextInt();
        System.out.println("Would you like your numbers in\n1. ascending, or\n2. descending order?");
        int order = input.nextInt();

        if(order == 1)
        {
            if(number1 > number2)
            {
                if(number1 > number3)
                {
                    System.out.println(number3 + "\n" + number2 + "\n" + number1);
                }
                else if(number1 < number3)
                {
                    System.out.println(number2 + "\n" + number1 + "\n" + number3);
                }
                else
                {
                    System.out.println("Entered values are not distinct");
                }
            }
            else if(number1 < number2)
            {
                if(number1 > number3)
                {
                    System.out.println(number3 + "\n" + number1 + "\n" + number2);
                }
                else if(number1 < number3)
                {
                    System.out.println(number1 + "\n" + number2 + "\n" + number3);
                }
                else
                {
                    System.out.println("Entered values are not distinct");
                }
            }
            else
            {
                System.out.println("Entered values are not distinct");
            }
        }
        else if(order == 2)
        {
            if(number1 > number2)
            {
                if(number1 > number3)
                {
                    System.out.println(number1 + "\n" + number2 + "\n" + number3);
                }
                else if(number1 < number3)
                {
                    System.out.println(number3 + "\n" + number1 + "\n" + number2);
                }
                else
                {
                    System.out.println("Entered values are not distinct");
                }
            }
            else if(number1 < number2)
            {
                if(number1 > number3)
                {
                    System.out.println(number2 + "\n" + number1 + "\n" + number3);
                }
                else if(number1 < number3)
                {
                    System.out.println(number3 + "\n" + number2 + "\n" + number1);
                }
                else
                {
                    System.out.println("Entered values are not distinct");
                }
            }
            else
            {
                System.out.println("Entered values are not distinct");
            }
        }
        else
        {
            System.out.println("Invalid selection.");
        }
    }
}
