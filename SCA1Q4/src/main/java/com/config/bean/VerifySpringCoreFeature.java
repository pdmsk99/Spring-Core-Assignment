package com.config.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

 
public class VerifySpringCoreFeature
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
 
        Demo  obj = (Demo) context.getBean("demoService");
 
        System.out.println( obj.getServiceName() );
    }
}