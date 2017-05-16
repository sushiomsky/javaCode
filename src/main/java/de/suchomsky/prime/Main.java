package de.suchomsky.prime;

public class Main {

public Main() {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
	Prime p = new Prime();
	System.out.println(p.findPrime(0l) + " ist eine Primzahl");
	// System.out.println(p.findPrime(10000000000000l) + " ist eine
	// Primzahl");
	/*
	 * for (long i = 0; i < Long.MAX_VALUE; i++) if (Prime.isPrime(i) ==
	 * true) System.out.println(i + " ist eine Primzahl" + Long.MAX_VALUE);
	 */
}

}
