package com.cg.training.lab8.client;

import com.cg.training.lab8.server.Exercise2;

public class Exercise2Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=new Exercise2();
		Thread t1=new Thread(runnable,"worker-1");
		t1.start();
	}
}