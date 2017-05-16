package de.suchomsky.methoden;

/**
 * Created by dennis on 14.03.17.
 */
public class Programmverlauf2 {

    public static void main(String[] args) {
        int x = 1;
    }

    public static void methode1(int x) {
        System.out.println(x);
        x++;
        methode2(x);
    }

    public static void methode2(int x) {
        int y;
        System.out.println(x);
        x++;
        y = methode3(x);

    }

    public static int methode3(int x) {
        System.out.println(x);
        x++;
        return x;
    }
}