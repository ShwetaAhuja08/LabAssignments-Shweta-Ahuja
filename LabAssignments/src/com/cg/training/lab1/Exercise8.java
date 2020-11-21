package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise8 {
	public boolean checkNumber(int n)
	{
		boolean flag=false;

		if(n%2==0)
		{
			int v=2;
			int b=1;
			lab:
				while(true)
				{
					for(int i=1;i<=n/2;i++)
					{
						b=b*v;
						if(b<n)
						{
							flag=false;
							continue;
						}
						else if(b==n)
						{
							flag=true;
							break lab;
						}
						else if(b>n)
						{
							flag=false;
							break lab;
						}
					}
				}
		}
		return flag;
	}
	public static void main(String[] ar)
	{
		Exercise8 b = new Exercise8();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println("Is it a power of 2?: "+b.checkNumber(n));
	}
}
