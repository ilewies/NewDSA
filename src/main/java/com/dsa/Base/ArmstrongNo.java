package com.dsa.Base;

public class ArmstrongNo {

	public static void main(String[] args) {

		int n = 153;
		int temp = n;
		int d = 0;
		int newNo = 0;

		while (n != 0) {
			d = n % 10;
			newNo = newNo + (d * d * d);
			n = n / 10;
		}

		System.out.println(" n -> " + temp + "  " + newNo);

	}
}
