package com.cg.training.lab8.client;

import com.cg.training.lab8.server.Exercise1;

public class Exercise1Demo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); 
		Thread t1= new Exercise1("worker-1");
		t1.start();
		
		

	}



}
