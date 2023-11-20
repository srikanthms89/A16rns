package com.tns.daysix.association;

//subclass
public class Manager extends Employee {

	private int teamSize;

	public Manager() {
		super();
	}

	

	public Manager(String name, int empId,String dept,int teamSize) {
		super(name,empId,dept);
		this.teamSize = teamSize;
	}



	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getName()=" + getName() + ", getEmpid()=" + getEmpid()
				+ ", getDept()=" + getDept() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
