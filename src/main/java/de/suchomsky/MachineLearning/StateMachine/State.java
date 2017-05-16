package de.suchomsky.MachineLearning.StateMachine;

import java.io.Serializable;

/**
 * Created by sushi on 20.03.17.
 */
public class State {


    protected final int stateData;

    //private int position;


    public State(int stateData) {
        this.stateData = stateData;
    }


    public int getStateData(){
        return stateData;
    }

    /**
     *
     * @todo will return wrong result if only first bit is set
     *
     * @param position bit at position (1-32) in integer
     * @return true if bit is set
     */
    public boolean getStateDatum(int position){
        if((stateData & 1 << position) != 0) return true;
        else return false;
    }


}
