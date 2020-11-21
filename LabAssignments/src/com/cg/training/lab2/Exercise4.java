package com.cg.training.lab2;

public class Exercise4 {
	public static int modifyArray(int arr[], int n){  

		int j = 0; 
		for (int i=0; i < n-1; i++){  
			if (arr[i] != arr[i+1]){  
				arr[j++] = arr[i];  
			}  
		}  
		arr[j++] = arr[n-1];  
		return j;  
	}  

	public static void main (String[] args) {  
		int arr[] = {10,10,20,30,30,40,50,60,60};  
		int length = arr.length;  
		length = modifyArray(arr, length);  

		for (int i =length-1; i >= 0; i--) {  
			System.out.print(arr[i] + " ");  
		}


	}  
}  