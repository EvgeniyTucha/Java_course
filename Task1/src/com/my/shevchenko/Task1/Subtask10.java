package com.my.shevchenko.Task1;

public class Subtask10 {

	public static void main(String[] args) {
		/*int sum=0;
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
		System.out.println(sum);*/
		int sum=0;
		int [] lst = new int [2000000];
		lst[1]=0;
		int k;
		for(k=2;k<2000000; k++)
			lst[k]=1;
		for(k=2; k*k<2000000; k++)
		{
			if(lst[k]==1)
			{
				for(int l = k*k; l<2000000; l+=k)
					lst[l]=0;
			}
			sum+=k;
		}
		System.out.print(sum);
}
}
