package com.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Emp;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");

		Emp emp = ac.getBean("myemployee", Emp.class);
		System.out.println(emp.toString());
	}
}