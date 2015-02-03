package com.my.shevchenko.Task1;

public class Subtask10 {

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
		long sumOfPrimes = 2;
		for (int num = 3; num < 2000000; num += 2) {
			if (isPrime(num)) {
				sumOfPrimes += num;
			}

		}
			System.out.println(sumOfPrimes);
	}
}
