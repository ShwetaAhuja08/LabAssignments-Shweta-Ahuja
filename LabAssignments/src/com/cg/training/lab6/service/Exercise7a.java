package com.cg.training.lab6.service;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}		
		int arr1[]=getSorted(arr);		
		System.out.println("After reversing and sorting the array elements: ");
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);
		}		
	}

	private static int[] getSorted(int[] arr) {
		String[] string= new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			StringBuilder strBuild =new StringBuilder();
			string[i]=String.valueOf(arr[i]);
			strBuild.append(string[i]);
			strBuild=strBuild.reverse();
			string[i]=strBuild.toString();						
		}
		int arr2[] = new int[arr.length];	 
		for(int i=0;i<arr.length;i++) {
		arr2[i]=Integer.parseInt(string[i]);
		}		
		Arrays.sort(arr2);
		return arr2;
	}

}