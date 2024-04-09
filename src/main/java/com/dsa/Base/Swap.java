package com.dsa.Base;

public class Swap {

	public static void swap(int a, int b) {
		System.out.println("a " + a + " b" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a " + a + " b" + b);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 0;

		System.out.println("a " + a + " b" + b);
		c = a;
		a = b;

		b = c;
		System.out.println("a " + a + " b" + b);

		System.out.println("swap 2");

		swap(10, 22);
	}
}
