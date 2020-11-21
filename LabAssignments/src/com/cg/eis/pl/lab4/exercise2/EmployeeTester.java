package com.cg.eis.pl.lab4.exercise2;

import java.util.Scanner;

import com.cg.eis.bean.lab4.exercise2.Employee;
import com.cg.eis.service.lab4.exercise2.EmployeeServiceImplementation;

public class EmployeeTester {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Enter Employee ID:");
		Integer id = sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		emp.setName(name);
		System.out.println("Enter Employee Salary:");
		Double sal = sc.nextDouble();
		emp.setSalary(sal);
		System.out.println("Enter Employee Designation:");
		String desig = sc.next();
		emp.setDesignation(desig);
		sc.nextLine();
		
		EmployeeServiceImplementation es = new EmployeeServiceImplementation();
		es.getDetails(emp);
		es.displayDetails(emp);
		es.findInsuranceScheme(emp);
		
	}

}
