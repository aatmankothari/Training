/*
Author : Aatman
Timestamp : 8 Jun 2018 19:13:26
 */
package com.home.main;

import java.io.IOException;
import java.net.*;

public class ipAddressCompare {

	public static void main(String[] args) throws UnknownHostException,MalformedURLException {
		InetAddress ip1 = InetAddress.getByName(new URL("http://flipkart.com").getHost());
		InetAddress ip2 = InetAddress.getByName(new URL("http://amazon.co.in").getHost());
		System.out.println("Kuch"+ip1.getLoopbackAddress());
		System.out.println(ip1 + " - " + ip2);
		if (ip1 == ip2) {
			System.out.println("They're equal");
		} else {
			System.out.println("They're not equal");
		}
		System.out.println("This:"+ip1.getHostAddress());
		InetAddress ip = InetAddress.getLocalHost();
        String hostname = ip.getHostName();
        System.out.println("Your current IP address : " + ip);
        System.out.println("Your current Hostname : " + hostname);
        ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(0);
	        System.out.println("listening on port " + serverSocket.getLocalPort());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}