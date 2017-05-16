package de.suchomsky.Arrays;

/**
 * Created by dennis on 07.03.17.
 * <p>
 * Erweitern Sie das Programm „Array1”, indem Sie ein weiteres ein-
 * dimensionales Array hinzufügen. Dieses Array soll dieselbe Größe
 * haben wie das Array aus dem Programm „Array1”. Jedoch soll der
 * Datentyp diesmal int sein. Füllen Sie das Array nach erfolgter Defi-
 * nition mit beliebigen Daten (z.B. Alter) und geben Sie beide Arrays
 * in einer printf -Anweisung aus. Nennen Sie Ihr neues Programm
 * „Array2”.
 */
public class Array2 {

public static void main(String[] args) {

	String[] namen = new String[6];
	namen[0] = "Willi";
	namen[1] = "Carsten";
	namen[2] = "Andreas";
	namen[3] = "Edith";
	namen[4] = "Dennis";
	namen[5] = "Florian";


	int[] alter = new int[namen.length];
	alter[0] = 5;
	alter[1] = 5;
	alter[2] = 5;
	alter[3] = 5;
	alter[4] = 5;
	alter[5] = 5;

	for (int i = 0; i < namen.length; i++) {
		System.out.println(namen[i] + " ist " + alter[i] + " Jahre alt.");
	}
}
}
