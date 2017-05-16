package de.suchomsky.methoden;

import java.util.Scanner;

/**
 * Created by dennis on 14.03.17.
 */
public class taschenrechner {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int x = scanner.nextInt();
        System.out.println("Zahl eingeben");

    }

    public static int addiere(int x, int y) {
        return x + y;
    }

    public static int multipliziere(int x, int y) {
        return x * y;
    }

    public static float dividiere(int x, int y) {
        return x / y;
    }

    public static int subtrahiere(int x, int y) {
        return x - y;
    }
}
