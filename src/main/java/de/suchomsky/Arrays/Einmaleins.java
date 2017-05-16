package de.suchomsky.Arrays;

/**
 * Speichern Sie die Ergebnisse des kleinen Einmaleins in einem Array.
 */
public class Einmaleins {
public static void main(String[] args) {
	int[] einmaleins = new int[100];
	int arrayIndex = 0;
	for (int i = 1; i < 10; i++) {
		for (int e = 1; e < 10; e++) {
			einmaleins[arrayIndex] = i * e;
			arrayIndex++;
		}
	}
}
}
