package com.dsa.Base;

import java.util.ArrayList;
import java.util.List;

public class Fibo {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(fibo(n));
	}

	private static List<Integer> fibo(int n) {

		List<Integer> list = new ArrayList<>();

		int a, b, c, i;

		a = 0;
		b = 1;
		list.add(a);
		list.add(b);

		for (i = 2; i < n; i++) {

			c = a + b;
			list.add(c);
			a = b;
			b = c;

		}

		return list;
	}
}
