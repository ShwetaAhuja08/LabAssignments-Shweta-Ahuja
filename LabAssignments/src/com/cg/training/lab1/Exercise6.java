package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=c.nextInt();
		calculateDifference(n);

	}

	public static void calculateDifference(int n) {
		int m=0,s=0;
		for(int i=0;i<=n;i++) {
			m=m+(i*i);
			s=s+i;
		}
		s=s*s;
		int diff=m-s;
		System.out.println("Difference: "+diff);
	}

}
