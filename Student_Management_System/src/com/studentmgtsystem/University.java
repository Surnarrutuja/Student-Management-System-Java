package com.studentmgtsystem;

public class University {

	public static void main(String[] args) {
		College c=new College();
		Student std=c.addStudent();
		System.out.println(std.id+" "+std.name+" "+std.address);
		
		System.out.println("====All Student=====");
		AllStudent All=c.addAllStudent();
		System.out.println(All.Rohini.id+" "+All.Rohini.name+" "+All.Rohini.address);
		System.out.println(All.Akshu.id+" "+All.Akshu.name+" "+All.Akshu.address);
		System.out.println(All.Sanika.id+" "+All.Sanika.name+" "+All.Sanika.address);

	}

}
