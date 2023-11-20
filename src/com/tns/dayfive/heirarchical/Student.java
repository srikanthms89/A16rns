package com.tns.dayfive.heirarchical;
//subclass
public class Student extends Person {
	
	private String cls;
	private float per;
	public Student() {
		
		System.out.println("student class default constructor");
		cls = "FY";
		per = 70;
	}
	public Student(String cls, float per) {
	
		this.cls = cls;
		this.per = per;
	}
	public Student(String name,String city,String cls, float per) {
		super(name,city);
		this.cls = cls;
		this.per = per;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [cls=" + cls + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	

}
