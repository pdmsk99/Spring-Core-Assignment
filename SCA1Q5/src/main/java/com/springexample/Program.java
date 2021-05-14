package com.springexample;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentH studentHolder = (StudentH) context.getBean("studentH");
            studentHolder.displayStudentDetails();
    }
}