package com.cg.lab4.Exercise1.service;

public class CurrentAccount extends Account {
  private double overDraftLimit;
  
  public void withdraw(double amt)
	{
		if(amt<overDraftLimit)
		    System.out.println("You Can Withdraw");
		else
			System.out.println("Reached limit!.. Can't Withdraw");
	}
  
}
