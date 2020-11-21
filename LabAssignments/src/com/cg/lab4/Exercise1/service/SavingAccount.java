package com.cg.lab4.Exercise1.service;

public class SavingAccount extends Account {
	final double minBalance=1000;
	
	public SavingAccount(long accnum, double bal,Person p)
	{
		super(accnum,bal,p);
	}
	
	public void withdraw(double amt)
	{
		if(amt>minBalance)
		{
			System.out.println("*********You can withdraw*******");
		   setBalance(getBalance()-amt);
		}
		else
		{
			System.out.println("*********You can't withdraw*******");
		}
	}
		

}
