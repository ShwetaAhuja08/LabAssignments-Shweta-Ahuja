package com.cg.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=scanner.nextInt();
		scanner.nextLine();
		String str[]=new String[n];
		
		System.out.println("Enter the names: ");
		for(int i=0;i<n;i++) {
		str[i]=scanner.nextLine();

		}
		Exercise2  obj=new Exercise2 ();
		obj.sortStrings(str);
		for(int i=0;i<n;i++) {
		System.out.println(str[i]);
		}

		}

		public void sortStrings(String[] str) {
		Arrays.sort(str);
		int mid;
		if(str.length % 2 != 0) {
		mid=str.length/2 +1;
		}
		else {
		mid=str.length/2;
		}
		for(int i=0;i<str.length;i++) {
		if(i<mid)
		str[i]=str[i].toUpperCase();
		else
		str[i]=str[i].toLowerCase();
		}
		}
		}


