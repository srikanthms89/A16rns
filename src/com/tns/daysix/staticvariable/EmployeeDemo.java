package com.tns.daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e = new Employee("punith",101);
		System.out.println(e);
		
		System.out.println(Employee.companyName);
		
		
		e = new Employee("Raj",102);
       System.out.println(e);
		
		System.out.println(Employee.companyName);

	}

}
