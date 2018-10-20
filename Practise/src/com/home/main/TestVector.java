/**
 * 
 */
package com.home.main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Aatman
 * 
 */
/*
 * public class TestVector { public static void main(String[] args) {
 * 
 * ArrayList<String> list = new ArrayList(); list.add("Aatman");
 * list.add("Nidhi"); list.add("Suvercha");
 * 
 * for (String s : list) {
 * 
 * System.out.println(s); System.out.println(s); System.out.println(s);
 * System.out.println("Element" + list); } }
 * 
 * }
 */
public class TestVector {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		System.out.println(vct);
		vct.add(2, "Random");
		/*
		 * System.out.println(vct); System.out.println("Element at index 3 is: "
		 * + vct.get(3));
		 * System.out.println("The first element of this vector is: "+
		 * vct.firstElement());
		 * System.out.println("The last element of this vector is: "+
		 * vct.lastElement()); System.out.println("Is this vector empty? " +
		 * vct.isEmpty()); vct.clear(); System.out.println(vct.isEmpty());
		 */
		Iterator<String> itr = vct.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(vct.size());
		TestVector v = new TestVector();
		v.starLoop();
	}

	void starLoop() {
		int a = 0, b = 1, c = 0, limit;
		Scanner scan = new Scanner(System.in);
		Integer x = 5;
		x += 5;
		System.out.println("" + x);

		System.out.print("Upto How Many Term ? ");
		limit = scan.nextInt();

		/* print the first two terms of the Fibonacci series */

		System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
		c = a + b;

		/*
		 * decrease the limit by 2, since the first two number of the Fibonacci
		 * series already printed manually
		 */

		limit = limit - 2;

		while (limit > 0) {
			System.out.print(c + "  ");
			a = b;
			b = c;
			c = a + b;
			limit--;
		}
	}
}
