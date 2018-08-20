package ro.sci.tema3p3;

import java.util.Scanner;

/**
 * Reads hours and minutes and displays time
 */
public class Time {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What time is it?");
        System.out.println("Input hour: ");
        int hour = keyboard.nextInt();
        System.out.println("Input minutes: ");
        int minute = keyboard.nextInt();
        boolean valid = checkIfValid(hour, minute);

        if (valid) {
            System.out.println("The time is " + hour + ":" + minute + " now");
        } else {
            System.out.println("Incorrect time!");
        }
    }

    /**
     * Checks if the values read are valid hours and minutes
     */
    public static boolean checkIfValid(int h, int m) {
        boolean v = true;
        if (h < 0 || h > 24 || m < 0 || m > 60) {
            v = false;
        }
        return v;
    }
}

