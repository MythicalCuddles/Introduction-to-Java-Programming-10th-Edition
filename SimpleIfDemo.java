import java.util.Scanner;

/**
 * Created by Melissa on 15/04/2017.
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if(number % 5 == 0)
            System.out.println("HiFive");

        if(number % 2 == 0)
            System.out.println("HiEven");
    }
}
