package com.my.shevchenko.Task1;

public class Subtask7 {

	public static void main(String[] args) {
		int sum=0;
		int [] lst = new int [2000000];
		for(int i = 2; i<2000000; i++)
		{
			for( int j=2; j<2000000; j++)
			{
				if(i%j == 0)
					break;
				else{
					lst[i]=i;
					sum+=i;
				}
			}	
		}
		System.out.println(sum);
	}

}