package Chapter_01;

/**
 * Introduction to Java Programming 10th Edition by Y Daniel Liang
 * Chapter 1 Exercise 12
 *        (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds.
 *        Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Melissa on 20/04/2017.
 */

public class Exercise_12 {
    public static void main(String[] args) {
        double hours = 1, minutes = 40, seconds = 35;
        double distanceInMiles = 24;

        double distanceInKilometers = distanceInMiles * 1.6;
        double timeInMinutes = (hours * 60.0) + (seconds / 60.0);

        // km/h = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60 * distanceInKilometers / timeInMinutes;
        System.out.println(kilometersPerHour);
    }
}
