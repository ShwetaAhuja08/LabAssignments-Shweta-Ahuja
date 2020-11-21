package com.cg.training.lab2;

public class Exercise3 {
	static void rvereseArray(int arr[],
			int start, int end)
	{
		int temp;

		while (start < end)
		{
			temp = arr[start]; 
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		} 
	}     

	static void printArray(int arr[], 
			int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println(" ");

		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting:");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();


	} 


	public static void main(String args[]) {

		int arr[] = {23,65,45,98,78,55};
		rvereseArray(arr, 0, 5);
		System.out.print("Reversed array: \n");
		printArray(arr, 6); 

	}
}







