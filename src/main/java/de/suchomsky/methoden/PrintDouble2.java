package de.suchomsky.methoden;

/**
 * Created by dennis on 14.03.17.
 */
public class PrintDouble2 {

    public static void main(String[] args) {
        for (double i = 0; i <= 42; i++) {
            Ausgabe(i);
        }
    }

    public static void Ausgabe(double zahl) {
        System.out.printf("%.5f%n", zahl);
    }
}

