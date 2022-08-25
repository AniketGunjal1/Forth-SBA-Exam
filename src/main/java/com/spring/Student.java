package com.spring;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String branch;
	
	
	public Student() {
		
	}


	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
class NameCompare implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
	return s1.getName().compareTo(s2.getName());
	}
	
}
