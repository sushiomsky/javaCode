package de.suchomsky.methoden;

/**
 * Created by dennis on 14.03.17.
 */
public class PrintInt {
    public static void main(String[] args) {
        for (int i = 0; i < 42; i++) {
            Ausgabe(i);
        }
    }

    public static void Ausgabe(int zahl) {
        System.out.println(zahl);
    }
}
