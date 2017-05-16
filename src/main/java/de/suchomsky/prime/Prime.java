/**
 * @author Dennis Suchomsky
 * @version 1.0
 */

package de.suchomsky.prime;

import java.util.Random;

/**
 *
 * Class to find prime numbers.
 *
 */

public class Prime {

/**
 *
 */
public Prime() {
}

/**
 * Empirical prime number test.
 *
 * Tests the division by every natural number that is less than the number
 * to test.
 *
 * @param pNumber Number to test.
 *
 * @return true if pNumber is prime
 */
private boolean isPrime(long pNumber) {
	for (long i = 2; i < pNumber; i++) {
		if (pNumber % (i) == 0) break;
		if ((i + 1) >= pNumber) return true;
	}
	return false;
}

/**
 * Fast Prime Number test.
 *
 * @param pNumber
 * @return
 */
private boolean isPrimeFast(long pNumber) {
	//check if pNumber is a multiple of 2
	if (pNumber % 2 == 0) return false;

	for (int i = 3; i * i <= pNumber; i += 2) {
		if (pNumber % i == 0) return false;
	}
	return true;
}

/**
 * Find a prime Number.
 *
 * @param min minimum prime number value
 * @return prime number
 */
public long findPrime(long min) {
	long number;
	do {
		number = getRandomNumber(min);
	} while (!isPrimeFast(number));
	return number;
}

/**
 * Generate a rondom number of min size.
 *
 * @param min
 * @return
 */
private long getRandomNumber(long min) {
	Random random = new Random();
	return random.nextLong() + min;
}

private int getRandomNumber(int min) {
	Random random = new Random();
	return random.nextInt(min);
}

}
