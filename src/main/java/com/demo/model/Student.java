package com.demo.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String city;
	private double percentage;
	// private List<String> hobbies;
	private Set<String> color = new LinkedHashSet<>();

	// Setter Injection with List
	/*
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + ", city=" + city + ", percentage=" + percentage + ", hobbies=" +
	 * hobbies + "]"; }
	 * 
	 * public List<String> getHobbies() { return hobbies; }
	 * 
	 * public void setHobbies(List<String> hobbies) { this.hobbies = hobbies; }
	 */

	public Set<String> getColor() {
		return color;
	}

	public void setColor(Set<String> color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + ", color="
				+ color + "]";
	}

	public Set<String> getS() {
		return color;
	}

	public void setS(Set<String> s) {
		this.color = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
