/*****************************************************
 Filename: 		    DrawOutlineOfBox
 Created by: 		Melissa B.
 Created on: 		29 March 2017
 ******************************************************/
public class DrawOutlineOfBox {
    static final int TOPROWCOUNT = 10;
    static final int DEEPCOUNT = 4;

    public static void main(String[] args) {
        printFullRow();
        printMiddleRow();
        printFullRow();
    }

    private static void printFullRow()
    {
        for(int i = 0; i < TOPROWCOUNT; i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    private static void printMiddleRow()
    {
        for(int i = 0; i < DEEPCOUNT; i++)
        {
            System.out.print("*");

            for(int c = 0; c < 8; c++)
            {
                System.out.print(" ");
            }

            System.out.println("*");
        }
    }
}
