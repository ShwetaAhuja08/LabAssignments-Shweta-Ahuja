package com.cg.training.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	static boolean isAlphabaticOrder(String s)  
    {  
       
        int a = s.length();  
        char b[] = new char [a];  
         
        for (int i = 0; i < a; i++) {  
            b[i] = s.charAt(i);  
        }  
      
        Arrays.sort(b); 
        for (int i = 0; i < a; i++)  
            if (b[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String s= sc.nextLine(); 
        if (isAlphabaticOrder(s))  
            System.out.println("True");  
         else
             System.out.println("False");  
             
	}

}

