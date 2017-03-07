public class SwapNumbers {
    /*
        Project Name:   Variables
        Created by: 	Melissa B.
        Created on: 	15/02/2017
    */
	
    public static void main(String[] args) {

        int num1, num2;	// 	declare 2 integer variables
        num1 = 25;		// 	store 25 in num1
        num2 = 39;		// 	store 39 in num2
        int temp;		// 	declare third variable called temp to act as a temporary variable

        //Print out initial values to screen
        System.out.println("The value of num1 is " + num1);
        System.out.println("The value of num2 is " + num2);
        System.out.println("\n\n");

        temp = num1;	// copy value of num1 into temp
        num1 = num2;	// copy value in num2 into num1
        num2 = temp;	// copy value in temp into num2

        //	Print out new values to screen

        System.out.println ("Value of num1 is now " + num1);
        System.out.println ("Value of num2 is now " + num2);


    }
}
