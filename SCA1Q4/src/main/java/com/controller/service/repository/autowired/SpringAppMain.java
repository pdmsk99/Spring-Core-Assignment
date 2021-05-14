package com.controller.service.repository.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringAppMain {
 public static void main(String[] args) {
 
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationC.xml");
  CountryC controller = (CountryC) context.getBean("countryC");
  Country country = controller.createNewCountry();
  System.out.println("Country Name : " + country.getCountryName());
  System.out.println("Country's Population : " + country.getPopulation());
 }
}