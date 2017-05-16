package de.suchomsky.MachineLearning.StateMachine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by sushi on 21.03.17.
 * 1. Add states
 * 2. Für alle unique states füge alle möglichen uniqe nachfolger hinzu
 * 3.
 */
public class StateMachine {

    /**
     * Represents a timeline of observed states
     */
    private ArrayList<State> observedStates = new ArrayList<>();

    private HashSet<State> uStates = new HashSet<>();

    /**
     * create a State Machine with the data to analyze
     * @param observedStates
     */
    public StateMachine(ArrayList<State> observedStates) {
        uStates = null;
        for (int i = 0; i < observedStates.size(); i++) {
            if (!uStates.add(observedStates.get(i))) {

            }

        }

        Iterator iterator = uStates.iterator();

        while (iterator.hasNext()){

        }
    }
}
