package com.cg.training.client;
import com.cg.training.server.Exercise3;
import java.util.Scanner;

public class Exercise3Tester {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username: ");
	String str1 = sc.next();
	System.out.println("Enter password: ");
	String str2 = sc.next();
	Exercise3 p=(x,y)->x.equals("Shweta") && y.equals("54321");
	System.out.println("Result:"+p.authenticate(str1, str2));

}
}
