import java.util.Scanner;

/**
 * Created by Melissa on 15/04/2017.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int number = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));
    }
}
