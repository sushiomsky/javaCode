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
public class Ui {
public static void main(String[] args) {
	String ip = "192.168.1.1";
	String netmask = "255.255.255.0";

	System.out.println("IP:" + IpCalc.ipToDecimal(IpCalc.ipToInteger(ip)));
	System.out.println("IP:" + Integer.toBinaryString(IpCalc.ipToInteger(ip)));
	System.out.println("NW:" + Integer.toBinaryString(IpCalc.calcNetworkAddress(IpCalc.ipToInteger(ip), IpCalc.ipToInteger(netmask))));
	System.out.println("BC:" + Integer.toBinaryString(IpCalc.calcBroadcastAddress(IpCalc.ipToInteger(ip), IpCalc.ipToInteger(netmask))));
	System.out.println("HOST:" + Integer.toBinaryString(IpCalc.calcHostAddress(IpCalc.ipToInteger(ip), IpCalc.ipToInteger(netmask))));
}
}
