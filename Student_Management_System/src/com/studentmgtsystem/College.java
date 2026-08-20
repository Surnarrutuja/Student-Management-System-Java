package com.studentmgtsystem;


public class College {
	
	public Student addStudent() {
		Student s=new Student();
		s.id=11;
		s.name="Rutuja";
		s.address="Nanded";
		return s;
	}
	
	public AllStudent addAllStudent() {
		AllStudent all=new AllStudent();
		all.Rohini.id=12;
		all.Rohini.name="Rohini";
		all.Rohini.address="Latur";
		all.Akshu.id=13;
		all.Akshu.name="Akshu";
		all.Akshu.address="Latur";
		all.Sanika.id=14;
		all.Sanika.name="Sanika";
		all.Sanika.address="Kolhapur";
		return all;
	}

}
