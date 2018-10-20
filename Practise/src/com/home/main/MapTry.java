/*
Author : Aatman
Timestamp : 19 Nov 2017 13:24:17
 */
package com.home.main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aatman
 * 
 */
public class MapTry {

	/*
	 * Map<Integer, String> mp = new HashMap<Integer, String>();
	 * 
	 * void putValues() { mp.put(123, "Aatman"); mp.put(123, "Kothari");
	 * mp.put(789, "Aatman"); }
	 * 
	 * void showValues() { for (Map.Entry l : mp.entrySet()) {
	 * System.out.println("EMP ID: " + l.getKey() + "- Name: "+ l.getValue()); }
	 * } void checkValues(){ for (Map.Entry l : mp.entrySet())
	 * if(mp.containsKey(123)){ mp.replace(123, "Seema Baruah is very cute!"); }
	 * }
	 */

	public static void main(String... args) {
		Object error = new Error();
		Object runtimeException = new RuntimeException();
		System.out.print((error instanceof Exception) + ",");
		System.out.print(runtimeException instanceof Exception);
	}
}