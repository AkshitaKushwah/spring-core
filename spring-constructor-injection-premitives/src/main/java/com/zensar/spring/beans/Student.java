package com.zensar.spring.beans;

public class Student {

	private int rollNumber;
	private String studentName;
	private int studentMarks;
	
	
	public Student() {
		super();
		System.out.println("Inside Student const..");
	
	}
	
	public Student(int rollNumber, String studentName, int studentMarks) {
		super();
		System.out.println("Inside public Student(int rollNumber, String studentName, int studentMarks) ");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
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
	
	
}
