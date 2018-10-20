/*
Author : Aatman
Timestamp : 3 Sep 2017 16:44:26
 */
package com.home.main;

import java.util.Scanner;

/**
 * @author Aatman
 * 
 */
public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			float sum = 0;
			sum = sum + (float) 1 / i;
			int num1 = 1 / n;
			System.out.println(sum);
		}
		n++;
	}
}
