/*
Author : Aatman
Timestamp : 1 Mar 2017 23:07:05
 */
package com.home.main;

import java.io.*;

interface Prime {
	public void prime(int num1);
}

interface Sum {
	public AddClass add(AddClass ac);
}

class AddClass implements Prime, Sum {
	int num1, num2;

	AddClass() {
		num1 = num2 = 0;
	}

	AddClass(int a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input two numbers : ");
		System.out.println("Input the first number : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Input the second number : ");
		num2 = Integer.parseInt(br.readLine());
	}

	public AddClass add(AddClass ac) {
		AddClass ac1 = new AddClass();
		ac1.num1 = this.num1 + ac.num1;
		ac1.num2 = this.num2 + ac.num2;
		return (ac1);
	}

	public void prime(int num1) {
		int flag = 0;
		for (int i = 2; i < num1 / 2; i++) {
			if (num1 % 2 == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("The number " + num1 + "Prime");
		else
			System.out.println("The number " + num1 + " Not Prime");
	}

	public void display(AddClass ac) {
		AddClass ac1 = this.add(ac);
		prime(this.num1);
		System.out.println("The addition of first two number : " + ac1.num1);
		System.out.println("The addition of second two number : " + ac1.num2);
	}
}

class ThisExample {
	public static void main(String ar[]) throws IOException {
		AddClass ac = new AddClass(1);
		AddClass ac1 = new AddClass(1);
		ac.display(ac1);
	}
}