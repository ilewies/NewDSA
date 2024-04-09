package com.dsa.NewDSA;

public class PrimeNumber {

	public static String isPrime(int n) {

		String no = "";

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return "not a prime";
			}
		}

		return "prime no";
	}

	public static void main(String... args) {

		for (int i = 1; i <= 20; i++) {
			System.out.println(i+" "+PrimeNumber.isPrime(i));
		}

		;
	}
}
