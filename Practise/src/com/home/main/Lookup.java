package com.home.main;

import java.net.*;

public class Lookup {
	public static void main(String args[]) {
		for (String name : args) {
			try {
				InetAddress address = InetAddress.getByName(name);
				System.out.println("Name: " + address.getHostName());
				System.out.println("Addr: " + address.getHostAddress());
			} catch (UnknownHostException e) {
				System.err.println("Unable to lookup " + name);
			}
		}
	}
}
