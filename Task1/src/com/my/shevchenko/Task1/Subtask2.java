package com.my.shevchenko.Task1;

public class Subtask2 {

	public static void main(String[] args) {
		int previous = 0;
		int current = 1;
		int res = 0;
		while (res < 4000000) {
			int c = 0;
			c = current + previous;
			previous = c + current;
			current = c + previous;

			if (previous % 2 == 0)
				res += previous;
			else {
				if (current % 2 == 0)
					res += current;
				else {
					if (c % 2 == 0)
						res += c;
				}
			}
		}
		System.out.print(res);
	}
}
