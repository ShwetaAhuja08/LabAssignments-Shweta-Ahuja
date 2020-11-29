package com.cg.training.client;

import com.cg.training.server.Exercise1;

public class Exercise1Tester {

	public static void main(String[] args) {
		Exercise1 powFun=(x,y) -> Math.pow(x,y);
		System.out.println("Result :"+powFun.power(2,6));
	}

	

}

