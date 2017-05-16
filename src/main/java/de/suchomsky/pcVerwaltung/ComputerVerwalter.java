package de.suchomsky.pcVerwaltung;

/**
 * Created by dennis on 04.04.17.
 */

public class ComputerVerwalter {
    private int taktung;
    private int ram;
    private int baujahr;
    private double preis;

    ComputerVerwalter(int taktung,
                      int ram,
                      int baujahr,
                      double preis) {
        this.taktung = taktung;
        this.ram = ram;
        this.baujahr = baujahr;
        this.preis = preis;

    }

    public void print(){
        System.out.println("Taktung: " + taktung);
        System.out.println("Ram: " + ram);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Preis: " + preis);
    }

}
