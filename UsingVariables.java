public class UsingVariables {
    /*
        Project Name:   Variables
        Created by: 	Melissa B.
        Created on: 	15/02/2017
    */
	
    public static void main(String[] args) {
        // 	declaration and initialisation of variables
        char letter = 'A';	// Single chars - use single quote
        int num1 = 25;
        double num2 = 35.67;

        //	Values stored in variables output to screen
        System.out.println ("Value stored in letter is " + letter);
        System.out.println("Value stored in num1 is " + num1);
        System.out.println("Value stored in num2 is " + num2);
        System.out.print("\n\n");

        // 	Values of the variables can be changed
        letter = 'B';
        num1 = 157;
        num2 = -157.69;

        //	Values stored in variables output to screen
        System.out.println ("Value now in letter is " + letter);
        System.out.println ("Value now in num1 is " + num1);
        System.out.println ("Value now in num2 is " + num2);
        System.out.print("\n\n");
    }
}
