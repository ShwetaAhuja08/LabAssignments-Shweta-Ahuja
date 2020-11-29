package com.cg.training.lab6.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.service.Exercise6;

public class VoterTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Exercise6 voter = new Exercise6();
		Map<Integer, Integer> voterMap = new HashMap<>();
		System.out.println("Enter number of voters: ");
		int size = scanner.nextInt();
		
		for(int i =0;i<size;i++) {
		System.out.println("Enter ID of "+(i+1)+" voter");
		voter.setId(scanner.nextInt());
		System.out.println("Enter age of "+(i+1)+" voter");
		voter.setAge(scanner.nextInt());				
		voterMap.put(voter.getId(),voter.getAge());
		}
		
		List<Integer> votersLists = voterList(voterMap);
		System.out.println("List of voters eligible to vote: ");
		for(int i=0;i<votersLists.size();i++ ) {
			System.out.println(votersLists.get(i));
		}	
	}

	private static List<Integer> voterList(Map<Integer, Integer> voterMap) {
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> e : voterMap.entrySet()) {
			if(e.getValue()>18) {
				list.add(e.getValue());
			}
        }
		
		return list;		
	}
}