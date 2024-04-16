package com.dsa.Arrary;

import java.util.Arrays;

public class ArrayBase {

	public static void main(String[] args) {

		int[] a = new int[3];

		int[] b = { 1, 2, 3 };

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
	}
}
