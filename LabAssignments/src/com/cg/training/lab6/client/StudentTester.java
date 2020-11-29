package com.cg.training.lab6.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.service.Exercise4;

public class StudentTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> studentMap = new HashMap<>();
		Exercise4 student = new Exercise4();
		System.out.println("Enter number of students: ");
		int size = scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter ID and marks of "+(i+1)+" student");
			student.setId(scanner.nextInt());
			student.setMarks(scanner.nextInt());
			studentMap.put(student.getId(),student.getMarks());
		}
		
		Map<Integer,String> studMap = getStudents(studentMap);
		System.out.println("Students having medals");
		for(Map.Entry<Integer,String> e : studMap.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> studentMap) {
		Map<Integer,String> studmap = new HashMap<>();
		for(Map.Entry<Integer,Integer> e : studentMap.entrySet()) {
			if(e.getValue()>=90) {
				studmap.put(e.getKey(),"Gold");
			}else if(e.getValue()<90 && e.getValue()>=80) {
				studmap.put(e.getKey(),"Silver");
			}else if(e.getValue()<80 && e.getValue()>=70) {
				studmap.put(e.getKey(),"Bronze");
        }
		
	
	}
		return studmap;
 }
}
