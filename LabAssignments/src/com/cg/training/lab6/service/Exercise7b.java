package com.cg.training.lab6.service;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7b {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		Integer [] list= new Integer[5];
		list[0]=63;
		list[1]=19;
		list[2]=96;
		list[3]=45;
		list[4]=71;
		int temp=getSorted(list);
		if(temp==1) {
			for(Integer m: list) {
				System.out.println(m);
			}
		}else {
			System.out.println("Unable to sort");
		}              
		Integer check[]= getSortedAgain();      
		for(Integer m: check) {
			System.out.println(m);
		}
	}
	private static Integer[] getSortedAgain() {
		Integer [] list= new Integer[5];
		list[0]=63;
		list[1]=19;
		list[2]=96;
		list[3]=45;
		list[4]=71;
		String [] reverseNumbers= new String[list.length];
		for(int i=0;i<list.length;i++) {
			reverseNumbers[i]= list[i].toString();
			StringBuffer sb= new StringBuffer(reverseNumbers[i]);
			reverseNumbers[i]=sb.reverse().toString();
			list[i]= Integer.parseInt(reverseNumbers[i]);
		}        
		Arrays.sort(list);
		return list;
	}
	private static int getSorted(Integer[] list) {
		String [] reverseNumbers = new String[list.length];
		for(int i=0;i<list.length;i++) {
			reverseNumbers[i]= list[i].toString();
			StringBuffer sb= new StringBuffer(reverseNumbers[i]);
			reverseNumbers[i]=sb.reverse().toString();
			list[i]= Integer.parseInt(reverseNumbers[i]);
		}        
		Arrays.sort(list);
		return 1;
	}
}