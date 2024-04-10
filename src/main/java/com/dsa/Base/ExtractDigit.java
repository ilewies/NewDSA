package com.dsa.Base;

public class ExtractDigit {

	public static void main(String[] args) {

		int n = 5698;
		int d, r = 0;
		while (n != 0) {
			d = n % 10;
			r = r * 10 + d;
			System.out.println(d);
			n = n / 10;
		}

		System.out.println("reverse : " + r);
	}
}
