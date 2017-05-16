package de.suchomsky.exceptions;

/**
 * Created by dennis on 10.04.17.
 */

public class NoBinaryNumberException extends RuntimeException {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public NoBinaryNumberException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public NoBinaryNumberException(String message) {
        super(message);
    }

    public NoBinaryNumberException(String binaryNumber, int position) {
        super(binaryNumber + " ist keine Binärzahl an position " + position);
    }

}
