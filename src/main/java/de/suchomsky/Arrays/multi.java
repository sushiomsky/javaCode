package de.suchomsky.Arrays;

/**
 * Created by dennis on 13.03.17.
 */
public class multi {

    public static void main(String[] args) {
        char[][] note = new char[4][4];//{{1,2,3},{4,5,6},{7,8,9}};
        note[0][0] = '0';
        note[0][1] = '1';
        note[0][2] = '2';
        note[0][3] = '3';

        note[1][0] = '4';
        note[1][1] = '5';
        note[1][2] = '6';
        note[1][3] = '7';

        note[2][0] = '8';
        note[2][1] = '9';
        note[2][2] = 'A';
        note[2][3] = 'B';

        note[3][0] = 'C';
        note[3][1] = 'D';
        note[3][2] = 'E';
        note[3][3] = 'F';

        System.out.println(note[0][0]);
        System.out.println(note[0][1]);
        System.out.println(note[0][2]);
        System.out.println(note[0][3]);

        System.out.println(note[1][0]);
        System.out.println(note[1][1]);
        System.out.println(note[1][2]);
        System.out.println(note[1][3]);

        System.out.println(note[2][0]);
        System.out.println(note[2][1]);
        System.out.println(note[2][2]);
        System.out.println(note[2][3]);

        System.out.println(note[3][0]);
        System.out.println(note[3][1]);
        System.out.println(note[3][2]);
        System.out.println(note[3][3]);
    }
}
