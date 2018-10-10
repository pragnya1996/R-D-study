package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer sum=list.stream().reduce(100, (x,y)->x+y);
		System.out.println(sum);
		System.out.println("======================================");
		
		List<String> lists=new ArrayList<String>();
	   lists.add(" java");
	   lists.add(" dance");
	   lists.add("music ");
	   
	   List<String> collect=lists.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
          collect.forEach(System.out::println);
	}

}
