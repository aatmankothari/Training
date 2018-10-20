/*
Author : Aatman
Timestamp : 28 Feb 2017 21:44:02
 */
package com.home.main;

import java.util.Scanner;

/**
 * @author Aatman
 * 
 */
public class Fibonacci {
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String args[]) {
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(count - 2);// n-2 because 2 numbers are already printed
	}
}