package com.cg.training.client;

import java.util.Scanner;

import com.cg.training.server.Exercise2;
public class Exercise2Tester {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String s = sc.next();
				
		Exercise2 formatString=(s1) -> s1.replaceAll("", " ");

		System.out.println("result :"+ formatString.stringformat(s));
		
	}
}