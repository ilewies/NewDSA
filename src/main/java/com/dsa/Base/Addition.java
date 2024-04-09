package com.dsa.Base;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("a is");
		int a = scanner.nextInt();

		System.out.println("b is ");
		int b = scanner.nextInt();
		System.out.println("addition is --> " + (a + b));
	}
}
