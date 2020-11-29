package com.cg.training.lab6.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {

	public static void main(String args[]) {

		Map<Integer,String> hashMap = new HashMap<>();

		hashMap.put(1,"Aarya");
		hashMap.put(2,"Bhoomi");
		hashMap.put(3,"Shweta");
		hashMap.put(4,"Jahnavi");
		hashMap.put(5,"Sonia");
		hashMap.put(6,"Ridhima");

		List<String> list1 = getValue(hashMap);
		System.out.println(list1);
	}

	public static List<String> getValue(Map<Integer, String> hashMap){
		List<String> list2 = new ArrayList<>();

		for(Map.Entry<Integer,String> s : hashMap.entrySet()) {
			list2.add(s.getValue());
		}

		Collections.sort(list2);

		return(list2);
	}

}
