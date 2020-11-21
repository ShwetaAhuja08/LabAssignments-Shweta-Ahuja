package com.cg.training.lab2;

public class Exercise1 {
	public static int getSecondSmallest(int[] a, int n){  
		int t;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    t = a[i];  
		                    a[i] = a[j];  
		                    a[j] = t;  
		                }  
		            }  
		        }  
		       return a[1]; 
		}  
		public static void main(String args[]){  
		int a[]={33,89,4,87,55,10};   
		System.out.println("Second smallest element: "+getSecondSmallest(a,6));  
		}}  

