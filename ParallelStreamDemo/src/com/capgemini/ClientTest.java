package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("pragnya", 22));
		list.add(new Student("rk", 30));
		list.add(new Student("kk", 26));
		list.add(new Student("mk", 20));
		list.add(new Student("prabhu", 21));
		
		Stream<Student> parallelStream=list.parallelStream();
		parallelStream.forEach(s->doProcess(s));

	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}
