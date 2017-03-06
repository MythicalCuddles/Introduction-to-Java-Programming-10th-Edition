import java.util.Scanner;

public class ASCIIConvert {
    /*****************************************************
     Filename: 		    ASCIIConvert
     Created by: 		Melissa B.
     Created on: 		01 March 2017
     Comment: 		    Use the ASCII codes of letters to convert them from lowercase to uppercase and vise-versa.
     ******************************************************/

    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter character to convert:");
        char input = keyboardInput.next().charAt(0);
        char output;

        if((int)input >= 65 && (int)input <= 90) // Between A and Z
        {
            output = (char)(((int) input) + 32);
        }
        else if((int)input >= 97 && (int)input <= 122) // Between a and z
        {
            output = (char)(((int) input) - 32);
        }
        else // Not a letter
        {
            output = input;
        }

        System.out.println(output);
    }
}
