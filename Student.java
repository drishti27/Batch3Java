package com.main;

public class Student{
	
	String name;
	Integer age;
	String address;
	
	public static Student student = null;
	
	public static Student.getObject(){
		if(null == student) {
			student = new Student();
		}
		return student;
	}
	
}