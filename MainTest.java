package com.main;

public class MainTest{
	
	public static void main(String[] args) {
		
		Student std = Student.getObject();//Student();
		std.setName("Drishti");
		System.out.println(std.getName());
		Student std1 = Student.getObject();
		System.out.println("Done");
	}
}