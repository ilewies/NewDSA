package com.dsa.Arrary;

import java.util.Arrays;

public class SSorting {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 5, 4, 7, 6, 9, 8 };
		int c;

		System.out.println(Arrays.toString(a));

//		for (int i = 0; i < a.length - 1; i++) {
//
//			for (int j = i + 1; j < a.length; j++) {
//
//				if (a[i] > a[j]) {
//					int temp;
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(a));

		for (int y = 0; y < a.length - 1; y++) {

			for (int x = y + 1; x < a.length; x++) {

				if (a[y] > a[x]) {
					int tt;
					tt = a[y];
					a[y] = a[x];
					a[x] = tt;
				}
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
	}
}
