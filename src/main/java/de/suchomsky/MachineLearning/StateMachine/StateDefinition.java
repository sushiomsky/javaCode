package de.suchomsky.MachineLearning.StateMachine;

/**
 * Created by sushi on 21.03.17.
 */
public abstract class StateDefinition {

    static int setBit(int n, int pos ) {
        return n | (1 << pos);
    }


    static int clearBit( int n, int pos )
    {
        /**
         * bit moved left by pos bits than reversed
         * and bitwise AND to set only the bit at pos to zero
         */
        return n & ~(1 << pos);
    }

    static int flipBit( int n, int pos )
    {
        return n ^ (1 << pos);
    }

    static boolean testBit( int n, int pos )
    {
        return (n & 1<<pos) != 0;
    }

}
