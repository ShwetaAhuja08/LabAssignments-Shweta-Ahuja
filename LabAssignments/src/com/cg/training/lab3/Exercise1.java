package com.cg.training.lab3;


import java.util.*;
public class Exercise1 {
	
	
		    public static void main(String args[]) {
		        int m;
		        int sum = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter an Integer(with one space):");
		        String s = sc.nextLine();
		        StringTokenizer st = new StringTokenizer(s, " ");
		        while (st.hasMoreTokens()) {
		            String t = st.nextToken();
		            m = Integer.parseInt(t);
		            System.out.println(m);
		            sum = sum + m;
		        }
		        System.out.println("Sum " + sum);
		       
		    }
		}


