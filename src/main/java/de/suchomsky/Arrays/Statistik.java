package de.suchomsky.Arrays;

/**
 * Created by dennis on 07.03.17
 * Entwickeln Sie ein Programm für eine statistische Erhebung. Die
 * Personalnummern sind 5-stellig von 00001 bis 17689. Es soll nur
 * ein Teil der Mitarbeiter befragt werden. Ihr Programm soll jedem 6.
 * Mitarbeiter, aber nicht jedem 12. Mitarbeiter, dafür aber jedem 48.
 * Mitarbeiter auswählen und in einem eindimensionalen Array able-
 * gen. Zeigen Sie die ausgewählten Mitarbeiter an..
 */
public class Statistik {
public static void main(String[] args) {
	for (int i = 0; i < 17689; i++) {
		if ((i % 6 == 0 && i % 12 != 0) || (i % 48 == 0)) {
			System.out.println("Mitarbeiter " + i);
		}
	}
}
}
