package com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		String arr[]= new String[]{"AA","BB","CC"};
		Stream<String> stream=Arrays.stream(arr);
		/*
		for(String str:arr){
			System.out.println(str);
		}*/
		stream.forEach(System.out::println);
		Stream<String> of=Stream.of("a","b","c","d");
		System.out.println("===============================");
		of.forEach(System.out::println);
		
		List<String> s=new ArrayList<>();
		s.add("pragnya");
		s.add("prabhu");
		
		Stream<String> stream2=s.stream();
		System.out.println("===============================");
		stream2.forEach(System.out::println);
	}

}
