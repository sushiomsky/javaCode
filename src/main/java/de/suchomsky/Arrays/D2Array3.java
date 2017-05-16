package de.suchomsky.Arrays;

import java.util.Scanner;

/**
 * Created by dennis on 13.03.17.
 */
public class D2Array3 {
    public static void main(String[] args) {
        String[][] array2D = new String[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array2D[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array2D[i][j]);
            }
        }
    }
}