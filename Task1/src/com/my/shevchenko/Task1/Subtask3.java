package com.my.shevchenko.Task1;

public class Subtask3 {

	public static void main(String[] args) {
		long numb = 600851475143L;
		int i;
		for(i = 2; i<numb; i++)
		{
			if(numb%i==0)
			{
				numb/= i;
		            i--;
			}
		}
		System.out.println(i);
	}

}
