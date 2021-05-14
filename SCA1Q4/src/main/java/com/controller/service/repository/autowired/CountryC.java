package com.controller.service.repository.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
@Controller ("countryC")
public class CountryC 
{
     @Autowired
    CountryS countryS;
 
    public Country createNewCountry()
    {
        return countryS.createNewCountry();
    }
}