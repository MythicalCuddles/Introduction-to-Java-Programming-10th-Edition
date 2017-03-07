public class ReverseNumbers {
    /*
        Project Name:   Variables
        Created by: 	Melissa B.
        Created on: 	15/02/2017
    */
	
    public static void main(String[] args) {
        int reversedNum = 0;
        int Num = 456;

        while (Num != 0)
        {
            reversedNum = reversedNum * 10 + Num % 10;
            Num = Num / 10;
        }

        System.out.println(reversedNum);
    }
}
