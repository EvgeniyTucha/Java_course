package com.my.shevchenko.Task1;

public class Subtask6 {

	public static void main(String[] args) {
		int k = 1;
		int r = 0;
		int sum1=0;
		int sum2=0;
		for(int i = 1; i<=100; i++)
		{
			sum2+=i;
			k=(int) Math.pow((int)i,2);
			sum1+=k;
		}
		k=(int) Math.pow(sum2, 2);
		r=k-sum1;
		System.out.println(sum1);
		System.out.println(k);
		System.out.print(r);
	}

}
