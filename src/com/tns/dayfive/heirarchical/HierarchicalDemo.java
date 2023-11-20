package com.tns.dayfive.heirarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("........person details are..........");
		System.out.println(p1);
		
		Person p;
		p= new Person("akash","Chennai");
		
		if(p instanceof Person)
			System.out.println("person details are" +p);
		
		
		p = new Employee("kumar","Mumbai",101,55000,"sales");
		if(p instanceof Employee)
			System.out.println("Employee details are" +p);
		
		p = new Student("raj","bangalore","Fy",70);
		if(p instanceof Student)
			System.out.println("Student details are" +p);
		

	}

}
