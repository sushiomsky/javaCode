package de.suchomsky.oop;

/**
 * Created by dennis on 28.03.17.
 */

public class Portemonnaie {
    private int bargeld;

    Portemonnaie(){
        this.bargeld = 0;
    }

    Portemonnaie(int bargeld){
        this.bargeld = bargeld;
    }

    public int geldEntnehmen(int summe){
        if (bargeld-summe < 0){
            bargeld = 0;
            return bargeld;
        }else {
            bargeld -= summe;
            return summe;
        }
    }

    public void geldHinzufügen(int summe){
        bargeld += summe;
    }
}
