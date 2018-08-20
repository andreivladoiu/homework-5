package ro.sci.tema3p2;

import java.util.Scanner;

/**
 * Reads temperature in Fahrenheit degrees and displays it in Celsius degrees
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input temperature in Fahrenheit degrees:");
        double tempF = keyboard.nextDouble();
        double tempC = convert(tempF);
        System.out.println("Your body temperature in Celsius degrees is: " + tempC);
        if (tempC > 37) {
            System.out.println("You are ill");
        }
    }

    /**
     * Converts temperature from Fahrenheit degrees to Celsius degrees
     */
    public static double convert(double f) {
        double c = (f - 32) / 1.8;
        return c;
    }
}


