package com.my.Shevchenko.Task2;

class AdvancedCalc {

}

class Calculation extends AdvancedCalc {
	int add(int x1, int x2) {
		return x1 + x2;
	}

	int add(int x1, int x2, int x3) {
		return x1 + x2 + x3;
	}

	int sub(int x1, int x2) {
		return x1 - x2;
	}

	int sub(int x1, int x2, int x3) {
		return x1 + x2 + x3;
	}
}

public class Subtask3 {
	public static void main(String[] args) {
		Calculation res = new Calculation();
		System.out.println("Addition with 2 summand = " + res.add(10, 15));
		System.out.println("Addition with 3 summand = " + res.add(5, 5, 8));
		System.out.println("Subtraction with 2 number = " + res.sub(5, 4));
		System.out.println("Subtraction with 2 number = " + res.sub(10, 4, 2));
	}

}
