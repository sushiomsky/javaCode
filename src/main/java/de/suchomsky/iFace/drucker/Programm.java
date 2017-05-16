package de.suchomsky.iFace.drucker;

/**
 * Created by dennis on 06.04.17.
 */

public class Programm {
    public static void druck(Drucker druckerObj){
        druckerObj.print();
    }
    public static void main(String[] args){
        Bildschirm bildschirm = new Bildschirm();
        Datei datei = new Datei();
        druck(datei);
        druck(bildschirm);
    }
}
