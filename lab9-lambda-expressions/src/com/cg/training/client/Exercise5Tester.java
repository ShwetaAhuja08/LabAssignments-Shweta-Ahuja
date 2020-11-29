package com.cg.training.client;

import java.util.Scanner;
import java.util.function.Function;

import com.cg.training.server.Exercise5;

public class Exercise5Tester {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		Function<Integer,Integer> f1 = Exercise5::factorial; 
		int factorial = f1.apply(num);
		System.out.println("Factorial of "+num+ ": " +factorial);

}
}


