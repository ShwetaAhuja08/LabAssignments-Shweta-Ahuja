package com.cg.training.client;

import java.util.ArrayList;
import java.util.List;

import com.cg.training.server.Exercise4;

public class Exercise4Tester {	
	public static void main(String[] args) {
		List<Exercise4> CarList=new ArrayList<>();
		getDetails(CarList);
		CarList.stream()
		.map(Exercise4::getCarName)
		.forEach(System.out::println);		
	}

	private static void getDetails(List<Exercise4> carList) {
		carList.add(new Exercise4("Hyundai","White"));
		carList.add(new Exercise4("Honda","Black"));		
	}
}
