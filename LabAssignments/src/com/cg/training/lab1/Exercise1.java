package com.cg.training.lab1;

public class Exercise1 {
	public static int sumOfSeries(int n)
	{
		int a=0;
		for(int i=1;i<=n;i++)
			a +=i*i*i;
		return a;
	}

	public static void main(String[] args) {
		
		int n=5;
		System.out.println(sumOfSeries(n));

	}

}
