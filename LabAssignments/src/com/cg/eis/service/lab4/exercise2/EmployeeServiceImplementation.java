package com.cg.eis.service.lab4.exercise2;

import java.util.Scanner;

import com.cg.eis.bean.lab4.exercise2.Employee;

public class EmployeeServiceImplementation implements  EmployeeService {
	Employee emp = new Employee();
	@Override
	
	public void getDetails(Employee e) {
		
		
		Integer id = e.getId();
		String name = e.getName();
		Double sal = e.getSalary();
		String desig = e.getDesignation();
		String InsScheme = e.getInsuranceScheme();
	}

	@Override
	public void findInsuranceScheme(Employee e) {
		if(e.getSalary()>20000 && e.getDesignation().equals("data analyst"))
			System.out.println("Insurance Scheme = Medical");
		else if(e.getSalary()>25000 && e.getDesignation().equals("software engineer"))
			System.out.println("Insurance Scheme = Maternity");
		else if(e.getSalary()>3000 && e.getDesignation().equals("administrator"))
			System.out.println("Insurance Scheme = Car");
		
		
	}

	@Override
	public void displayDetails(Employee e) {
		System.out.println(	"ID = "+e.getId()+
		"\nName = "+ e.getName()+
		"\nSalary = "+e.getSalary()+
		"\nDesignation = "+e.getDesignation());
		
	}

}
