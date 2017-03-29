import java.util.Scanner;

/*****************************************************
 Filename: 		    MultiplyNumber
 Created by: 		Melissa B.
 Created on: 		29 March 2017
 ******************************************************/
public class MultiplyNumber {
    public static void main(String[] args) {
        int userNumber, multiplyNumber;

        userNumber = getUserNumber();
        multiplyNumber = getUserNumber();
        System.out.println(userNumber + " x " + multiplyNumber + " = " + multiplayNumbers(userNumber, multiplyNumber));
    }

    public static int multiplayNumbers(int number1, int number2){
        return number1 * number2;
    }

    public static int getUserNumber() {
        Scanner _scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        return _scanner.nextInt();
    }
}
