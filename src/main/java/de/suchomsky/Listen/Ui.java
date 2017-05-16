package de.suchomsky.Listen;

/**
 * Created by sushi on 16.03.17.
 */
public class Ui {

public static void main(String[] args) {
	Alist alist = new Alist();
	alist.fillList();
	alist.printList();
	alist.bubbleSort();
	alist.bubbleSortV2();
	alist.printList();
}
}
