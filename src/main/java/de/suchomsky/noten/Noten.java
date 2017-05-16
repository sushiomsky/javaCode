package de.suchomsky.noten;

import java.util.ArrayList;

/**
 * Created by dennis on 04.04.17.
 */

public class Noten {
    private ArrayList<Integer> noten;

    Noten(Integer... noten){
        for (Integer note: noten){
            this.noten.add(note);
        }
    }

    public void notenAnzeigen(){
        int i = 1;
        for (Integer note: noten){
            System.out.println("Die " + i + ". Note ist eine: " + note);
        }
    }
}
