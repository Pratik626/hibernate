package com.wipro.java.hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int roll;
	private String Name;
	
	
	public Student(int roll, String name) {
		this.roll = roll;
		Name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	

}
