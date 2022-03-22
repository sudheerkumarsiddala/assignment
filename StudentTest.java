package com.training.cg;

public class StudentTest {
	public static void main(String args[]) {
		Student st1= new Student(1001,"Munny", 21);
		Student st2= new Student(1002,"Bunny", 22);
		Student st3= new Student(1003,"Sunny", 23);
		System.out.println(st1.isEqual(st2));
		
	}
}