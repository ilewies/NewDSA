package com.dsa.Base;

public class StrongNo {

	public static void main(String[] args) {

		int n = 145;
		int d = 0;
		int sum = 0;
		int temp = n;

		while (n != 0) {
			d = n % 10;
			sum = sum + facto(d);
			n = n / 10;
		}

		System.out.println(" n " + temp + "  sum " + sum);
	}

	private static int facto(int d) {
		int facto = 1;
		if (d == 0) {
			return 1;
		}
		while (d != 0) {

			facto = facto * d;
			d--;
		}
		return facto;
	}

}
