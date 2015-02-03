package com.my.shevchenko.Task1;

public class Subtask6 {

	public static void main(String[] args) {
		DifferenceSquare();
	}

	public static void DifferenceSquare() {
		int sumsquare = 0;
		int sumofsquare = 0;
		for (int i = 1; i <= 100; i++) {
			sumofsquare += i * i;
			sumsquare += i;
		}
		System.out.print(sumsquare * sumsquare - sumofsquare);
	}
}
