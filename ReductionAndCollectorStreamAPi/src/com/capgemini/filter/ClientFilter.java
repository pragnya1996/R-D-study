package com.capgemini.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientFilter {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("pragnya", 22));
		list.add(new Student("rk", 30));
		list.add(new Student("kk", 26));
		list.add(new Student("mk", 20));
		list.add(new Student("prabhu", 21));
		
		Stream<Student> filtered=list.stream().filter(s->s.getAge()>25);
		filtered.forEach(System.out::println);
		
		System.out.println("=====================");
		
		boolean allMatch=list.stream().allMatch(s->s.getName().contains("k"));
		System.out.println(allMatch);
		
		System.out.println("=====================");
		boolean noneMatch=list.stream().noneMatch(s->s.getAge()>40);
		
		System.out.println(noneMatch);
	}	
	
}
