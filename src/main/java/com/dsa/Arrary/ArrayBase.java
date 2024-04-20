package com.dsa.Arrary;

import java.util.Arrays;

public class ArrayBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = new int[3];

		int[] b = { 1, 2, 3, 4, 5, 6,7,0, 8, 9, 10, 11 };

		int i = 0;
		while (i < b.length) {

			System.out.println(b[i]);
			i++;
		}

		for (i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		for (int h : b) {
			System.out.println(h);
		}
		System.out.println(Arrays.toString(b));

		int sum = 0;

		for (int q = 0; q < b.length; q++) {
			sum = b[q] + sum;
		}
		System.out.println("sum " + sum);

		int evensum = 0;

		int qq = 0;
		while (qq < b.length) {

			if (b[qq] % 2 == 0) {
				evensum = evensum + b[qq];
			}
			qq++;
		}

		System.out.println("even elements sum : " + evensum);

		int sumodd = 0;

		for (int ww : b) {
			if (ww % 2 != 0) {
				sumodd = sumodd + ww;
			}
		}

		System.out.println("sum of odd no : " + sumodd);

		int sumOfEvenIndex = 0;

		for (int qqq = 0; qqq < b.length; qqq++) {

			if (qqq % 2 == 0) {
				sumOfEvenIndex = sumOfEvenIndex + b[qqq];
			}
		}

		System.out.println("sum of even index elements: " + sumOfEvenIndex);

		// sum of prime nos in the array
		int sumofprimeno = 0;

		for (int s4 : b) {

			if (prime(s4)) {

				sumofprimeno = sumofprimeno + s4;
			}
		}

		System.out.println("sum of prime no: " + sumofprimeno);

		int notPrimeSum = 0;
		// sum of not prime no
		for (int tt = 0; tt < b.length; tt++) {

			if (notPrime(b[tt])) {
				notPrimeSum = notPrimeSum + b[tt];
			}
		}

		// max no in arrary

		int max = b[0];

		for (int ok = 1; ok < b.length; ok++) {

			if (max < b[ok]) {
				max = b[ok];
			}
		}

		System.out.println("max no is : " + max);

		// min element

		int min = b[0];

		for (int hhh = 1; hhh < b.length; hhh++) {
			if (min > b[hhh]) {
				min = b[hhh];
			}
		}

		System.out.println("min is " + min);
	}

	private static boolean prime(int s) {
		if (s == 1) {
			return true;
		}
		for (int i = 2; i < s; i++) {

			if (s % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean notPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % 2 == 0) {
				return true;
			}
		}

		return false;
	}

}
