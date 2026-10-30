package com.studentmgtsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class College {
	
	public List<Student> addStudent() {
		Student student=new Student(11,"ABC","Nanded");
		Student student1=new Student(12,"PQR","Latur");
		Student student2=new Student(13,"XYZ","Pune");
		Student student3=new Student(14,"LMN","Ambajogai");
		
		List<Student> StudentList=new ArrayList<Student>();
		StudentList.add(student);
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		
		System.out.println("*****Student List Using Iterator******");
		Iterator<Student> itr=StudentList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*****Student List Using For each******");

		for(Student s:StudentList) {
			System.out.println(s);
		}
		return StudentList;
	}
	
//	public AllStudent addAllStudent() {
//		AllStudent all=new AllStudent();
//		all.Rohini.id=12;
//		all.Rohini.name="Rohini";
//		all.Rohini.address="Latur";
//		all.Akshu.id=13;
//		all.Akshu.name="Akshu";
//		all.Akshu.address="Latur";
//		all.Sanika.id=14;
//		all.Sanika.name="Sanika";
//		all.Sanika.address="Kolhapur";
//		return all;
//	}

}
