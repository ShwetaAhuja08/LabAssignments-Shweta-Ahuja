package com.cg.training.lab8.server;

import java.io.*;
import java.io.BufferedReader;

public class Exercise1 extends Thread {
	public Exercise1() {

	}

	public Exercise1(String threadName) {
		super(threadName);
	}
	public void run()
	{
		System.out.println(Thread.currentThread()); 

		try {
			FileReader fileread = new FileReader("C:\\Users\\shweta\\Desktop\\test.txt");
			BufferedReader bufferread = new BufferedReader(fileread );
			FileWriter filewrite = new FileWriter("C:\\Users\\shweta\\Desktop\\test.txt", true);
			int s;
			while ((s = bufferread.read()) != -1) { 
				if(s%10==0)
				{
					System.out.println("characters copied successfully");
					try {
						Thread.sleep(100*50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				filewrite.write(s); 
			}
			bufferread.close();
			filewrite.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}