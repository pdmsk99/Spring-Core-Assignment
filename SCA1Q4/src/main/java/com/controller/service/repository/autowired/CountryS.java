package com.controller.service.repository.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("countryS")
public class CountryS {
    @Autowired
 CountryDAO countryDAO;
 public Country createNewCountry() {
 
  return countryDAO.createNewCountry();
 }
 
}