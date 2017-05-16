package de.suchomsky.abstrakt;

/**
 * Created by dennis on 06.04.17.
 */

public class Circle extends GeometrischeFigur {

    private double radius;
    private double umfang;
    private double durchmesser;

    Circle(){

    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
        radius = durchmesser/2;
        flaechenInhalt = Math.PI*Math.exp(radius);
        umfang = 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        durchmesser = radius*2;
        flaechenInhalt = Math.PI*Math.exp(radius);
        umfang = 2*Math.PI*radius;
    }

    public double getUmfang() {
        return umfang;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
        radius = umfang/(2*Math.PI);
        durchmesser = 2*radius;
        flaechenInhalt = Math.PI*Math.exp(radius);
    }

    @Override
    double berechneFlaecheninhalt() {
        return flaechenInhalt;
    }

}
