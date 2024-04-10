package com.dsa.Base;

public class PerfectNo {

	public static boolean isPerfect(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		return sum == n;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10000; i++) {
//			System.out.println(i + " -> " + isPerfect(i));
			if (isPerfect(i)) {
				System.out.println(i);
			}
		}

	}
}
