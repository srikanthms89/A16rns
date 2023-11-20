package com.tns.dayfive.multilevel;

public class MlInheritanceDemo {

	public static void main(String[] args) {
		
		
		City city = new City ();
		city.setCityName("bangalore");
		city.setArea(267.78f);
		city.setStateName("karnataka");
		city.setLanguage("kannada");
		city.setCountryName("India");
		city.setCapital("Delhi");
		
		System.out.println(city);
		

	}

}
