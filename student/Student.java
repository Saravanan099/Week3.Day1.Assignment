package org.student;

import org.department.Department;

public class Student extends Department{
	public void	studentName() {
		System.out.println("Student Name");
		}
	
		public void studentDept()
		{
		System.out.println("Student Department");
		}
		
		public void studentId() {
		System.out.println("Student ID");
		}
		
	public static void main(String[] arguments) {
		Student Stu=new Student();
																																				
		//college methods 
		Stu.collegeCode();
		Stu.collegeName();
		Stu.collegeRank();
		
		//dep methods
		Stu.deptName();
		
		//student methods
		Stu.studentName();
		Stu.studentDept();
		Stu.studentId();
		
	}
		
}
