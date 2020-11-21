package com.cg.lab4.Exercise1.client;

import com.cg.lab4.Exercise1.service.Account;
import com.cg.lab4.Exercise1.service.Person;
import com.cg.lab4.Exercise1.service.SavingAccount;

public class AccountDemo {

	public static void main(String[] args) {
		
//		Account[] acc1 = new Account[2];
//		
//		acc1[0] = new Account(101,2000.0,new Person("Smith",22));
//		acc1[1] = new Account(102,3000.0,new Person("Kathy",25));
//		System.out.println("-------------------\n");
//		System.out.println("Before Updation:");
//		System.out.println("-------------------\n");
//		acc1[0].display();
//		System.out.println("-------------------\n");
//		acc1[1].display();
//		
//		acc1[0].deposit(2000.0);
//		acc1[1].withdraw(2000.0);
//		System.out.println("-------------------\n");
//		System.out.println("After Updation:");
//		System.out.println("-------------------\n");
//		acc1[0].display();
//		System.out.println("-------------------\n");
//		acc1[1].display();
		
		Account[] acc1 = new SavingAccount[2];
		
		acc1[0] = new SavingAccount(101,2000.0,new Person("Smith",22));
     	acc1[1] = new SavingAccount(102,3000.0,new Person("Kathy",25));
     	
     	System.out.println("-------------------\n");
		System.out.println("Before Updation:");
		System.out.println("-------------------\n");
		acc1[0].display();
		System.out.println("-------------------\n");
		acc1[1].display();
		
		acc1[0].deposit(2000.0);
		acc1[1].withdraw(2000.0);
		System.out.println("-------------------\n");
		System.out.println("After Updation:");
		System.out.println("-------------------\n");
		acc1[0].display();
		System.out.println("-------------------\n");
		acc1[1].display();
		acc1[1].withdraw(900.0);
		
		
		
	}

}
