package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice:");
	    String choice = scanner.nextLine();
	   
	    switch (choice) {

	      case "Red":
	       System.out.println("Stop");
	        break;

	      case "Yellow":
	    	  System.out.println("Ready");
		        break;

	      case "Green":
	    	  System.out.println("Go");
		        break;
	    }
	  }

}

