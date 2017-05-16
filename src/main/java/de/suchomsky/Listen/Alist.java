package de.suchomsky.Listen;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by sushi on 16.03.17.
 */
public class Alist {

	static final int MAX_LIST_SIZE = 1024;// * 1024;

	private ArrayList<Integer> randomData = new ArrayList<Integer>();
	private ListIterator<Integer> randomDataIterator;

	public Alist(){
		randomDataIterator = randomData.listIterator();
	}

	public  void fillList(){
		Random random = new Random();
		while (randomData.size() < MAX_LIST_SIZE){
			randomData.add(random.nextInt(0x7fffffff));
		}
	}


	public  void printList(){
		randomDataIterator = randomData.listIterator();

		while (randomDataIterator.hasNext()){
			System.out.println(randomDataIterator.next());
		}
	}

public void bubbleSort(){
	int tmp;
	//element mit vorgänger vergleichen und vertauschen wenn links>rechts
	for (int i = 1; i < randomData.size(); i++) {
		if (randomData.get(i-1) > randomData.get(i)){
			tmp = randomData.get(i-1);
			randomData.set(i-1,randomData.get(i));
			randomData.set(i,tmp);
			i = 1;
		}
	}

}
public void bubbleSortV2(){
	int tmp;
	boolean sorted = true;
	//element mit vorgänger vergleichen und vertauschen wenn links>rechts
	for (int i = 1; i < randomData.size(); i++) {
		if (randomData.get(i-1) > randomData.get(i)){
			tmp = randomData.get(i-1);
			randomData.set(i-1,randomData.get(i));
			randomData.set(i,tmp);
			sorted = false;
		}
	}
	if (sorted == false) {
		bubbleSortV2();
	}
}
}
