package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Student;

public class App 
{
    public static void main( String[] args )
    {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Student student1 = context.getBean(Student.class,"student");
		
		//Student student2 = context.getBean(Student.class,"student");
		
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student");
		
	
		/*
		 * student.setRollNumber(1001);
		 * 
		 * student.setStudentName("Akshita");
		 * 
		 * student.setStudentMarks(95);
		 */
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
    
    }
}
