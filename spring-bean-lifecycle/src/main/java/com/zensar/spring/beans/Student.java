package com.zensar.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student /* implements InitializingBean, DisposableBean */{

	private int rollNumber;
	private String studentName;
	private int studentMarks;
	
	
	public Student() {
		super();
		System.out.println("Inside Student const..");
	
	}
	
	public Student(int rollNumber, String studentName, int studentMarks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		System.out.println("inside public void setRollNumber(int rollNumber)");
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	public void myInit() {
		
		System.out.println("inside public void myInit() ");
	}
	
	public void myDestroy() {
		
		System.out.println("inside public void myDestroy() ");
	}

	/*
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub
	 * System.out.println("inside public void destroy() throws Exception"); }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub System.out.
	 * println("inside public void afterPropertiesSet() throws Exception "); }
	 */
}
