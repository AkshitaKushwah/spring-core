package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Student;

public class App 
{
    public static void main( String[] args )
    {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = context.getBean(Student.class,"student");
		
		//Student student2 = context.getBean(Student.class,"student");
		
		//Student student = (Student) context.getBean("student");
		
		
		System.out.println(student);
		context.registerShutdownHook();
	
    
    }
}
