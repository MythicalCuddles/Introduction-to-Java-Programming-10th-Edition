package Chapter_01;

/**
 * Introduction to Java Programming 10th Edition by Y Daniel Liang
 * Chapter 1 Exercise 8
 *      (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 *
 *      perimeter = 2 * radius * PI
 *      area = radius * radius * PI
 *
 * Created by Melissa on 20/04/2017.
 */

public class Exercise_08 {
    public static void main(String[] args) {
        System.out.println("Perimeter = " + ((2 * 5.5) * Math.PI));
        System.out.println("Area = " + ((5.5 * 5.5) * Math.PI));
    }
}
