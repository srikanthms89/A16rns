//program to demonstrate usage of IS -A Relationship
package com.tns.daysix.association;

public class Employee {
	
	private String name;
	private int empid;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int empid, String dept) {
		super();
		this.name = name;
		this.empid = empid;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + "]";
	}
	
	

}
