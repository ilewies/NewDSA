package com.dsa.Base;

public class Paliondrom {

	public static void main(String[] args) {

		System.out.println(checkPali(123));
	}

	private static boolean checkPali(int i) {

		int rev = 0, d = 0;
		int n = i;

		while (i != 0) {

			d = i % 10;
			rev = rev * 10 + d;
			i = i / 10;
		}

		System.out.println("n " + n + " rev " + rev);

		return n == rev;

	}
}
