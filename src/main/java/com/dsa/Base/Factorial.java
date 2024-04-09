package com.dsa.Base;

public class Factorial {

	public static void main(String[] args) {

		double n = 20;

		System.out.println(facto1(n));
		System.out.println(facto2(n));
		System.out.println(facto3(n));
	}

	private static double facto1(double n) {

		double facto = 1;

		while (n != 0) {
			facto = facto * n;
			n--;
		}

		return facto;
	}

	private static double facto2(double n) {
		double f = 1;

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}

		return f;
	}

	private static double facto3(double n) {
		if (n == 0) {
			return 1;
		}

		return n * facto3(n - 1);
	}

}
