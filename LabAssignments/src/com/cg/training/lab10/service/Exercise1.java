package com.cg.training.lab10.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1
{
	public static void main(String args[])throws IOException
	{
		int j=1;
		char ch;
		Scanner scanner=new Scanner(System.in);
		FileInputStream fis=new FileInputStream("C:\\Lab Assignment\\source.txt");
		System.out.println("\nContents of the file ");
		int n=fis.available();
		System.out.print(j+": ");
		for(int i=0;i<n;i++)
		{
			ch=(char)fis.read();
			System.out.print(ch);
			if(ch=='\n')
			{
				System.out.print(++j+": ");

			}
		}
	}
}
