package de.suchomsky.Arrays;

import java.util.Scanner;

/**
 * Created by dennis on 07.03.17.
 * Verändern Sie das Programm „Array3”, indem die Ausgabe der Da-
 * ten in umgekehrter Reihenfolge zur Eingabe erfolgt. Nennen Sie Ihr
 * neues Programm „Array4”.
 */
public class Array4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Wieviele Teilnehmer?");
	int anzahlTeilnehmer = sc.nextInt();

	String namen[] = new String[anzahlTeilnehmer];
	int alter[] = new int[anzahlTeilnehmer];

	for (int i = 0; i < anzahlTeilnehmer; i++) {
		System.out.println("Name eingeben");
		namen[i] = sc.next();
		System.out.println("Alter eingeben");
		alter[i] = sc.nextInt();
	}

	for (int i = anzahlTeilnehmer; i >= 0; i--) {
		System.out.println(namen[i] + " ist " + alter[i] + " Jahre alt.");
	}


	sc.close();
}

}
