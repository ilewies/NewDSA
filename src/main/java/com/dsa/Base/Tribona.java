package com.dsa.Base;

import java.util.ArrayList;
import java.util.List;

public class Tribona {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(trib(n));
	}

	private static List<Integer> trib(int n) {
		List<Integer> list = new ArrayList<>();
		int a, b, c, d = 0, i;

		a = 0;
		b = 1;
		c = 2;

		list.add(a);
		// lavesh
		list.add(b);
		list.add(c);

		for (i = 3; i < n; i++) {
			d = a + b + c;
			list.add(d);
			a = b;
			b = c;
			c = d;
		}

		return list;
	}
}
