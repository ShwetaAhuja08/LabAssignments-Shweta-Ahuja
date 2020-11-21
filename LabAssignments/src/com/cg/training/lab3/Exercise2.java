package com.cg.training.lab3;

import java.util.*;
import java.util.Scanner;

public class Exercise2 {
	
		
		
		public static String rev(String s){
		return new StringBuilder(s).reverse().toString();
		}

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
		String a= sc.next(); 
		String a1= rev(a);
		System.out.println("Reversed String : "+a+"|"+a1);
		}
		}
