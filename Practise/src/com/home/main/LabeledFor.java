/*
Author : Aatman
Timestamp : 15 Jun 2017 23:37:25
 */
package com.home.main;

/**
 * @author Aatman
 * 
 */
public class LabeledFor {

	public static void main(String[] args) {
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
