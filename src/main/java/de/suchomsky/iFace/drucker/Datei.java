package de.suchomsky.iFace.drucker;

/**
 * Created by dennis on 06.04.17.
 */

public class Datei implements Drucker {
    @Override
    public void print() {
        System.out.println("Text ausgabe Datei");
    }
}
