package de.suchomsky.iFace.async;

import java.util.Timer;

/**
 * Created by dennis on 06.04.17.
 */
public class AsyncMain {
    public static void main( String[] args )
    {
        WorkerThread t1 = new WorkerThread();
        Timer timer = new Timer();

        // Start in 2 Sekunden
        timer.schedule( new WorkerThread(), 2000 );

        // Start in einer Sekunde dann Ablauf alle 5 Sekunden
        timer.schedule( new WorkerThread(), 1000, 5000 );
    }
}
