package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args)
	{
		int m;
		int q;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		m=s.nextInt();
		System.out.println("Prime numbers upto "+m+" ");
		for(int i=2;i<m;i++)
		{
			q=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					q=1;
			}
			if(q==0)
				System.out.println(i);
		}
	}



}

