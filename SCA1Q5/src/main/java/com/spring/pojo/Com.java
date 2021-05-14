package com.spring.pojo;

public class Com {

	private String name;
	private String location;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Com [name=" + name + ", location=" + location + "]";
	}
}