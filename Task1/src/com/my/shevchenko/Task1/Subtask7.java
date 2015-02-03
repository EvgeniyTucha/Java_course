package com.my.shevchenko.Task1;

import java.util.ArrayList;

public class Subtask7 {

	public static void main(String[] args) {
		primeNumbers();

	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void primeNumbers() {
		int num = 2;
		ArrayList<Integer> primesNumbers = new ArrayList<Integer>();
		while (primesNumbers.size() < 10001) {
			if (isPrime(num)) {
				primesNumbers.add(num);
			}
			num++;
		}
		System.out.println(primesNumbers.get(10000));
	}
}
