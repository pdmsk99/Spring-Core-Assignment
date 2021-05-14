package com.spring.pojo;

import javax.annotation.Resource;

public class Emp {

	private String id;
	private String name;

	@Resource(name="mycompany")
	private Com company;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Com getCompany() {
		return company;
	}
	public void setCom(Com company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", company=" + company.toString() + "]";
	}
}