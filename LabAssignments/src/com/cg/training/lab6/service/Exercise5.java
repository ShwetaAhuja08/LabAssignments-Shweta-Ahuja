package com.cg.training.lab6.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}		
		int secondSmallest = getSecondSmallest(arr);
		System.out.println("Second smallest element: "+secondSmallest);		
	}

	private static int getSecondSmallest(int[] arr) {
		List<Integer> list  =new ArrayList<>();
		for(Integer i : arr) {
			list.add(i);
		}
		Collections.sort(list);		
		int ss = list.get(1);
		return ss;
	}
}
