package Chapter_01;

/**
 * Introduction to Java Programming 10th Edition by Y Daniel Liang
 * Chapter 1 Exercise 11
 *       (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *       Write a program to display the population for each of the next five years.
 *       Assume the current population is 312,032,486 and one year has 365 days.
 *
 * Created by Melissa on 20/04/2017.
 */

public class Exercise_11 {
    public static void main(String[] args) {
        double birthRateInSeconds = 7.0, deathRateInSeconds = 13.0, newImmigrantInSeconds = 45.0;
        double currentPopulation = 312032486;
        double secondsInYears = 60 * 60 * 24 * 365;

        double numberOfBirths = secondsInYears / birthRateInSeconds;
        double numberOfDeaths = secondsInYears / deathRateInSeconds;
        double numberOfNewImmigrants = secondsInYears / newImmigrantInSeconds;

        System.out.println("Starting Population = " + (int)currentPopulation);
        for(int i = 0; i < 5; i++)
        {
            currentPopulation += numberOfBirths + numberOfNewImmigrants - numberOfDeaths;
            System.out.println("Year " + i + " : " + (int)currentPopulation);
        }
    }
}
