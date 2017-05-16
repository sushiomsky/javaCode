package de.suchomsky.methoden;

import java.util.Scanner;

/**
 * Created by dennis on 14.03.17.
 */
public class Eingaben {

    static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        return scanner.nextInt();
    }

    public static double inputDouble() {
        return scanner.nextDouble();
    }

    public static char inputChar() {
        return scanner.next().charAt(0);
    }

    public static String inputString() {
        return scanner.next();
    }
}
