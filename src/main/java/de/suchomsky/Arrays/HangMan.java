package de.suchomsky.Arrays;

import java.util.Scanner;

/**
 * Created by dennis on 07.03.17.
 * Erstellen Sie das Programm Hang-Man: Ein Wort wird in einem Ar-
 * ray eingegeben, der andere Mitspieler gibt nun einen Buchstaben
 * ein. Nach jeder Eingabe wird der Rateerfolg angezeigt:
 */
public class HangMan {

public static void main(String[] args) {
	final int VERSUCHE_MAX = 15;
	String wordToGuess;
	boolean[] known;
	boolean guessed;
	int versuche = 0;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Bitte zu erratendes Wort eingeben.");
	wordToGuess = scanner.next();
	known = new boolean[wordToGuess.length()];

	do {
		guessed = true;
		System.out.println("Bitte Buchstaben eingeben.");
		char buchstabe = scanner.next().charAt(0);

		for (int i = 0; i < wordToGuess.length(); i++) {
			if (known[i] == true || wordToGuess.charAt(i) == buchstabe) {
				known[i] = true;
				System.out.print(wordToGuess.charAt(i));
			} else {
				System.out.print(".");
				guessed = false;
			}
		}
	} while (versuche < VERSUCHE_MAX && guessed != true);
	if (guessed == true) {
		System.out.println("Glückwunsch!");
	} else {
		System.out.println("Verloren :(");
	}
}
}
