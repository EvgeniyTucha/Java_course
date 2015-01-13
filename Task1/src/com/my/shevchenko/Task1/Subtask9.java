package com.my.shevchenko.Task1;

public class Subtask9 {

	public static void main(String[] args) {
		int sum = 1000;
		int mull=1;
		for(int a = 1; a<=sum; a++)
		{
			for(int b = a+1; b<sum; b++)
			{
				int c = sum - a - b;
				if(a*a + b*b == c*c)
				{
					System.out.println("a=" +a);
					System.out.println("b=" +b);
					System.out.println("c=" +c);
					mull=a*b*c;
					System.out.println(mull);
				}
			}
		}
	}

}
