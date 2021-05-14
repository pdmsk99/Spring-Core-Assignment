package com.PostConstructPreDistroy.Core8beanPostPre;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class One
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});
        
        	Emp cust = (Emp)context.getBean("emp");
        	
        	System.out.println(cust);
        	
        	context.close();
    }
}
