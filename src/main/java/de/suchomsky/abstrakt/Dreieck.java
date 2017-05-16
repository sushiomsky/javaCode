package de.suchomsky.abstrakt;

/**
 * Created by dennis on 06.04.17.
 */

public class Dreieck extends GeometrischeFigur {

    public double getSeite() {
        return seite;
    }

    public void setSeite(double seite) {
        this.seite = seite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    private double seite, hoehe;

    @Override
    double berechneFlaecheninhalt() {

        return 0;
    }
}
