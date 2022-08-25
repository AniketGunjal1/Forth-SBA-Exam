package com.spring;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

	
	@GetMapping("/getStudent")
	public Student getStudent() {
		return new Student(1,"Ramesh","IT");
		
	}
	@GetMapping("/getStudents")
	public List<Student> getStdList(){
		
		List<Student> stdlist=new ArrayList<>();
		stdlist.add(new Student(1,"Rajesh","Mech"));
		stdlist.add(new Student(2,"Sanket","Comp"));
		stdlist.add(new Student(3,"Neha","Electrical"));
		stdlist.add(new Student(4,"Nisha","Mech"));
		stdlist.add(new Student(5,"Rushi","Comp"));
		stdlist.add(new Student(6,"Mahesh","Telecom"));
		stdlist.add(new Student(7,"Teena","IT"));
		stdlist.add(new Student(8,"Neha","Comp"));
		stdlist.add(new Student(9,"Nagesh","Mech"));
		stdlist.add(new Student(10,"Ruhi","IT"));
	
		
		return stdlist;
		
		
	
	
	}
}
