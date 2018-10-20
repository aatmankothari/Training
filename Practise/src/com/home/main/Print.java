/*
Author : Aatman
Timestamp : 15 Sep 2017 23:38:48
*/
package com.home.main;

/**
 * @author Aatman
 *
 */
public class Print {
	public static void main(String ar[]) {
		int a = 1;
		int b;
		while (a < 3) {
			for (b = 0; b < 5; b++) {
				System.out.print("\t" + b);
				if (2 == b)
					break;
			}
		}
		System.out.print("\n");
		a++;
	}
}
