package com.infotech.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.infotech.model.Student;

public class Test {

	public static void main(String[] args) {

		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("ram", 20));
		stuList.add(new Student("shyam", 16));
		stuList.add(new Student("kiran", 26));
		
		System.out.println("Students before sorting:");
		stuList.forEach(System.out::println);
		
		Comparator<Student> studentNameComp = (s1,s2)->s1.getName().compareTo(s2.getName());
		
		Collections.sort(stuList, studentNameComp);
		System.out.println("Students after sorting:");
		System.out.println("---------------------------");
		stuList.forEach(System.out::println);
	}

}
