package com.my.shevchenko.Task2;

public class Test {
	public static void main(String[] args) {
		AdvancedCalc res = new AdvancedCalc();
		System.out.println("Addition with 2 summand = " + res.add(10, 15));
		System.out.println("Addition with 3 summand = " + res.add(5, 5, 8));
		System.out.println("Subtraction with 2 number = " + res.sub(5, 4));
		System.out.println("Subtraction with 2 number = " + res.sub(10, 4, 2));
	}

}