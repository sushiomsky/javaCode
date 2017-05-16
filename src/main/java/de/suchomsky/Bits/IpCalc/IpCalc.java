/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package de.suchomsky.Bits.IpCalc;

/**
 * Created by sushi on 10.03.17.
 */
public class IpCalc {

/**
 * Convert a ip address from dotted decimal notation into 4 byte integer
 *
 * @param ip
 *
 * @return
 */
public static int ipToInteger(String ip) {
	String[] ipArray;
	int ipAddr;
	int octet;

	ipAddr = 0;
	ipArray = ip.split("\\.");

	int shifts = 24;    //bitcount to shift
	for (int i = 0; i < ipArray.length; i++) {
		octet = Integer.valueOf(ipArray[i]) << shifts;
		ipAddr |= octet;
		shifts -= 8;
	}
	return ipAddr;
}

/**
 * Convert a binary ip address to dotted decimal string
 *
 * @param ip
 *
 * @return
 */
public static String ipToDecimal(int ip) {
	StringBuilder result = new StringBuilder(15);

	for (int i = 0; i < 4; i++) {
		result.insert(0,Long.toString(ip & 0xff));
		if (i < 3) {
			result.insert(0,'.');
		}
		ip = ip >> 8;
	}
	return result.toString();
}

public static int calcNetworkAddress(int ip, int netMask) {
	return ip & netMask;
}

public static int calcBroadcastAddress(int ip, int netMask) {
	return ip | ~netMask;
}

public static int calcHostAddress(int ip, int netMask) {
	return ip & ~netMask;
}

}
