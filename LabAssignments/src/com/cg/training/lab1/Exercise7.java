package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise7 {
	private static Scanner tc=new Scanner(System.in);
	public static boolean checkNumber(int number) {
		boolean flag=false; 
		int c=0; 
		while(number >0) {  
			if(c>=number%10) { 
				flag=true;
				break;
			}
			else { 
				flag=false; 
				//return flag;
			}
			c=number%10;
			number=number/10;
		}
		return flag;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		int n=tc.nextInt();
		boolean flag1=checkNumber(n);
		if(flag1==true) {
			System.out.println("Digits are in increasing order ");
		}
		else {
			System.out.println("Digits are in decreasing order ");
		}
	}

}
