package com.my.shevchenko.Task1;

public class Subtask2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		/*System.out.println(a);
		System.out.println(b);*/
		int res=0;
		for(int i=0;i<=10;i++)
		{
			int c=0;
			c=b+a;
			a=c+b;
			b=c+a;
			/*System.out.println(c);
			System.out.println(a);
			System.out.println(b);*/
			if(a%2==0)
				res+=a;
			if(b%2==0)
				res+=b;
			if(c%2==0)
				res+=c;
		}
		System.out.print(res);
		}
	}
