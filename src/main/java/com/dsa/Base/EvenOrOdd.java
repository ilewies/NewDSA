package com.dsa.Base;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		while (true) {
			System.out.println("enter a no");

			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			if (n % 2 == 0) {
				System.out.println(n + " is even no");
			} else {
				System.out.println(n + " is odd no");
			}
		}

	}
}
