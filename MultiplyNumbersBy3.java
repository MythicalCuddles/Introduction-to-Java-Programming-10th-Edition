/*****************************************************
 Filename: 		    MultiplyNumbersBy3
 Created by: 		Melissa B.
 Created on: 		29 March 2017
 ******************************************************/
import java.util.Scanner;

public class MultiplyNumbersBy3 {
    public static void main(String[] args) {
        int userNumber;

        userNumber = getUserNumber();
        System.out.println(userNumber + " x 3 = " + multiplayNumberBy3(userNumber));
    }

    public static int multiplayNumberBy3(int number){
        return number * 3;
    }

    public static int getUserNumber() {
        Scanner _scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        return _scanner.nextInt();
    }
}
