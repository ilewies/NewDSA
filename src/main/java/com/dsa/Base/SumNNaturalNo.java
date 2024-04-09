package com.dsa.Base;

public class SumNNaturalNo {

	public static int reco(int n) {
		if (n == 0) {
			return 0;
		}
		return n + reco(n - 1);
	}

	public static void main(String[] args) {

		int n = 100;
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;
		}
		System.out.println("sum " + sum);

		int m = 100;
		int i = 0;
		int s = 0;
		while (m >= i) {
			s = s + i;
			i++;
		}

		System.out.println("s = " + s);

		System.out.println("sum =--" + (m * (m + 1) / 2));

		System.out.println("reco " + reco(100));
	}
}
