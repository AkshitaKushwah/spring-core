package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Address;
import com.zensar.spring.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	/*
		 * Address address = new Address(22322, "Mumbai", "Maha");
		 * 
		 * Student student= new Student(1,"Rani",11,address);
		 * 
		 * System.out.println(student);
		 */
	
    	
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		  
		  Student student = (Student) context.getBean("student");
		  
		  System.out.println(student); 
		/*
		 * student.setRollNumber(1001);
		 * 
		 * student.setStudentName("Akshita");
		 * 
		 * student.setStudentMarks(95);
		 */
    }
}
