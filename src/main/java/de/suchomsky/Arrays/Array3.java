package de.suchomsky.Arrays;

import java.util.Scanner;

/**
 * Verändern Sie das Programm „Array2”, indem die Eingabe der Da-
 * ten nun innerhalb einer for-Schleife erfolgt und der Benutzer dazu
 * aufgefordert wird, die jeweiligen Daten während des Programmab-
 * laufs einzugeben. Die Ausgabe soll innerhalb einer zweiten for-
 * Schleife in der Reihenfolge der Eingabe erfolgen. Nennen Sie Ihr
 * neues Programm „Array3”
 */
public class Array3 {

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

	for (int i = 0; i < anzahlTeilnehmer; i++) {
		System.out.println(namen[i] + " ist " + alter[i] + " Jahre alt.");
	}


	sc.close();
}
}
