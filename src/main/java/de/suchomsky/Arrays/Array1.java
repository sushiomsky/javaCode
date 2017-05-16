package de.suchomsky.Arrays;

/**
 * Created by dennis on 07.03.17.
 * <p>
 * Entwickeln Sie ein Programm „Array1”, um die Namen aller Teil-
 * nehmer Ihrer Klasse über die Tastatur zu erfassen und in einem Ar-
 * ray abzulegen. Anschließend sollen die Werte des Arrays am Monitor
 * angezeigt werden.
 */
public class Array1 {

public static void main(String[] args) {

	String[] namen = new String[6];
	namen[0] = "Willi";
	namen[1] = "Carsten";
	namen[2] = "Andreas";
	namen[3] = "Edith";
	namen[4] = "Dennis";
	namen[5] = "Florian";

	for (String name : namen) {
		System.out.println(name);
	}
}
}
