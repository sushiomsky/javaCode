package de.suchomsky.abstrakt;

/**
 * Created by dennis on 06.04.17.
 */

public abstract class GeometrischeFigur {
    private String farbe;
    protected double flaechenInhalt;

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    abstract double berechneFlaecheninhalt();
}
