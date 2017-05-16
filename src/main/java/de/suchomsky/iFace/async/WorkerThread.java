package de.suchomsky.iFace.async;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dennis on 06.04.17.
 */

public class WorkerThread extends TimerTask implements Work{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println( "Make my day." );

    }

    @Override
    public void work() {

    }
}
