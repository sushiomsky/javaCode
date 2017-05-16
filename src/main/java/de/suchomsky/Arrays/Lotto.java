package de.suchomsky.Arrays;

import java.util.Random;

/**
 * Created by dennis on 07.03.17.
 * Speichern Sie mit Hilfe des Zufallszahlengenerators die Lottozahlen
 * vom nächsten Samstag in einem eindimensionalen Array. Achtung:
 * keine Lottozahl darf doppelt vorkommen. Viel Glück!
 */
public class Lotto {

public static void main(String[] args) {
	int[] lottoZahlen = new int[6];
	int zahl = 0;
	boolean neu = true;

	for (int i = 0; i < lottoZahlen.length; i++) {
		do {
			neu = true;
			zahl = getRandomNumber();
			for (int j = 0; j < i; j++) {
				if (lottoZahlen[j] == zahl) {
					neu = false;
				}
			}
		} while (neu != true);

		lottoZahlen[i] = zahl;
	}

	for (int lZahl : lottoZahlen) {
		System.out.println(lZahl);
	}
}

public static int getRandomNumber() {
	Random random = new Random();
	return random.nextInt(49);
}
}
