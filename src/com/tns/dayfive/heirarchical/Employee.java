package com.tns.dayfive.heirarchical;

public class Employee extends Person {
	
	private int empId;
	private float sal;
	private String dept;
	
	public Employee() {
		
		System.out.println("Employee class default constructor");
	}

	public Employee(int empId, float sal, String dept) {
	
		this.empId = empId;
		this.sal = sal;
		this.dept = dept;
	}
	public Employee(String name, String city,int empId, float sal, String dept) {
		super(name,city);
		this.empId = empId;
		this.sal = sal;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", sal=" + sal + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	}
	
	


