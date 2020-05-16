package com.wealth.certificate.dumps_1z0_809_ert.question064;

public class Country {
	public enum Continent {ASIA, EUROPE}
	String name;
	Continent region;
	
	public Country(String na,Continent reg){
		name = na; region = reg;
	}
	public String getName() {return name;}
	public Continent getRegion() {return region;}
}