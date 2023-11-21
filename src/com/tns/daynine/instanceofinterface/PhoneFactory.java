package com.tns.daynine.instanceofinterface;

public class PhoneFactory {
	
	public static Phone createPhone(String company) {
		
		if(company.equalsIgnoreCase("Jio"))
			return new Jio();
		
		else if (company.equalsIgnoreCase("samsung"))
			return new Samsung();
		
		return null;
	}

}
