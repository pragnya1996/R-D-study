package com.capgemini.test;

import java.util.function.Consumer;

import com.capgemini.model.Student;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student student) {
		System.out.println(student);
		
	}
	

}
