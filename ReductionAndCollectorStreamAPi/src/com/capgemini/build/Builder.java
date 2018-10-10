package com.capgemini.build;

import java.util.stream.Stream;

public class Builder {
	public static void main(String[] args) {
		Stream<String> limit=Stream.<String>builder().add("mk").add("ck").build();
		limit.forEach(System.out::println);
		System.out.println("=======================");
		
		Stream<String> limit1=Stream.generate(()->"hello").limit(10);
		limit1.forEach(System.out::println);
	}
}
