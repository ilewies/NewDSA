package com.dsa.Base;

public class MinOrMax {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int max = (a > b && a > c) ? a : (b > c) ? b : c;

		System.out.println("max " + max);

		System.out.println(Math.max(10, Math.max(20, Math.max(56, 100))));

		int max2 = (a > b && a > c && a > d) ? a : (b > c && b > d ? b : (c > d ? c : d));

		int max3 = (a > b && a > c && a > d && a > e) ? a
				: (b > c && b > d && b > e ? b : (c > d && c > e ? c : (d > e ? d : e)));

		System.out.println("max 3 is " + max3);
	}
}
