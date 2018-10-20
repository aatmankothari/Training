package com.home.main;

import java.io.*;
import java.util.*;

class Employee {
	private int empId;
	private String name;
	private float basicSal;

	public void Employee() {
		empId = 0;
		name = "\0";
		basicSal = 0;
	}

	public void readdata() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Employee ID");
		empId = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee name");
		name = br.readLine();
		System.out.println("Enter Employee's Basic Salary");
		basicSal = scan.nextFloat();
		scan.close();
	}

	public void display() {
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee name is " + name);
		System.out.println("Employee's Basic salary is " + basicSal);
	}

	public float calculateDa() {
		float da;
		da = 50 * basicSal / 100;
		return da;
	}

	public float hra() {
		float hra;
		hra = basicSal * 10 / 100;
		return hra;
	}

	public float totalSal() // micro methods
	{
		float hra, da, tot;
		hra = hra();
		da = calculateDa();
		tot = da + hra + basicSal;
		return tot;
	}
}

public class MainClass {
	public static void main(String args[]) throws IOException {
		float totSal;
		/*Employee obj = new Employee();
		obj.readdata();
		obj.display();
		totSal = obj.totalSal();
		System.out.println("Total Salary " + totSal);*/
		
		//float totSal;
		/*Radhika obj1 = new Radhika();
		obj1.readdata();
		obj1.display();
		totSal = obj1.totalSal();
		System.out.println("Total Salary " + totSal);*/
		
		/*MapTry mt = new MapTry();
		mt.putValues();
		mt.checkValues();
		mt.showValues();*/
	}
}