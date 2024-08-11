package com.springentitieswithoutxml;

public class Student {
	private int id;
	private String name;
	private String state;
	private String city;
	private int marks;
	
	
	//setter and getter functions
	
	//setter id
	public void setstudentId(int id) {
		this.id=id;
	}
	
	public int getstudentId() {
		return id;
	}
	
	//setter i
	public void setstudentName(String name) {
		this.name=name;
	}

	public String getstudentName() {
		return name;
	}
	
	//setter state
	public void setstudentState(String state) {
		this.state=state;
	}
	
	public String getstudentState() {
		return state;
	}
	
	//setter city
	public void setstudentCity(String city) {
		this.city=city;
	}
	
	public String getstudentCity() {
		return city;
	}
	//setter marks
	public void setstudentMarks(int marks) {
		this.marks=marks;
	}
	public int getstudentMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", state=" + state + ", city=" + city + ", marks=" + marks
				+ "]";
	}
	
	
}

