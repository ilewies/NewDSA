package com.dsa.NewDSA;

public class PrimeNumber {

	public static boolean isPrime(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime2(int n) {
		int factor = 0;

		if (n == 1) {
			return true;
		}

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				factor++;
			}
		}

		return factor == 2;
	}

	public static boolean isPrime3(int n, int i) {
		if (i == 1) {
			return true;
		}

		if (n % i == 0) {
			return false;
		}
		return isPrime3(n, i - 1);
	}

	public static void main(String... args) {

		for (int i = 2; i <= 20; i++) {
			System.out.println(i + " " + PrimeNumber.isPrime(i) + " " + isPrime2(i) + " " + isPrime3(i, i / 2));
		}

		;
	}
}
