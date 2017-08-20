import java.util.Scanner;

/**
 * Created by Melissa on 20/08/2017.
 */
public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);
        int guess = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        while(number != guess)
        {
            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if(guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}
