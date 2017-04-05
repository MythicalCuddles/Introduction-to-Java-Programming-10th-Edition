import java.util.Scanner;

public class DoWhile {
    /*****************************************************
     Filename: 		    DoWhile
     Created by: 		Melissa B.
     Created on: 		05 April 2017
     Comment: 		    Using Logical AND - and Do-While Loop
     ******************************************************/

    public static void main(String[] args) {
        int option;
        Scanner input = new Scanner(System.in);

        do { // Do the following code before checking the conditions in while
            System.out.println("1. Hello.");
            System.out.println("2. Manage.");
            System.out.println("3. Goodbye.");

            option = input.nextInt(); // Read keyboard input for options
        }
        while (option != 1 & option != 2 & option != 3); // If input is not 1, 2 or 3, do the code

        switch(option) // Check value in option and output accordingly
        {
            case 1: // Option 1 is selected - Hello
                System.out.println("Hello World!");
                break;
            case 2: // Option 2 is selected - Manage
                System.out.println("Manage what?");
                break;
            case 3: // Option 3 is selected - Goodbye
                System.out.println("Oh okay. Goodbye *waves*");
                break;
            default: // Other option is selected
                // error message printed, as statement shouldn't be reached due to the do-while loop above.
                System.out.println("error");
                break;
        }
    }
}
