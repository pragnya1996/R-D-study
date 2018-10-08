package com.capgemini.test;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Student;

public class ClientTest {
	public static void main(String[] args){
		List<Student> list=new ArrayList<>();
		list.add(new Student("pragnya", 22));
		list.add(new Student("prajwal", 19));
		list.add(new Student("prabhu", 50));
		
		//list.forEach(System.out::println);
		list.forEach(new MyConsumer());
	}

}
