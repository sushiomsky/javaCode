/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package de.suchomsky.Bits.DecCalc;

/**
 * Created by sushi on 09.03.17.
 */
public class DecCalc {

public static void main(String[] args) {
	if (args.length != 2) {
		System.out.println("Usage: Bits.DecCalc number base");
		System.exit(1);
	}
	DecimalConvert(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
}

public static void DecimalConvert(int number, int base) {
	int rest = 0;
	int i = 0;

	int[] restArray = new int[20];

	while (number > 0) {
		rest = number % base;
		restArray[i] = rest;
		number = number / base;
		System.out.print(restArray[i]);
	}
}
}
