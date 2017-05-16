package de.suchomsky.Rekursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by sushi on 16.03.17.
 */
public class ArndList {
    static final int MAX_LIST_ENTRIES = 1024;

    private LinkedList<Integer> aRndList;
    private Random random;

    public ArndList() {
        random = new Random();
        fillList(MAX_LIST_ENTRIES);
    }

    public ArndList(int max_list_entries) {
        fillList(max_list_entries);
    }

    public List<Integer> getList(){
        return aRndList;
    }

    private void fillList(int entries_max){
        aRndList.add(random.nextInt(Integer.MAX_VALUE));
    }
}
