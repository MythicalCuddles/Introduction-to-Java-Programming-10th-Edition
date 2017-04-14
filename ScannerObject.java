import java.util.Scanner;

/**
 * Created by Melissa on 14/04/2017.
 */
public class ScannerObject {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = input.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
    }
}
