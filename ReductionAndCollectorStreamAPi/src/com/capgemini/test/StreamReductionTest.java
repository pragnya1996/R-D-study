package com.capgemini.test;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionTest {
	public static void main(String[] args) {
		OptionalInt reduced=IntStream.range(1, 4).reduce((a,b)->a+b);
	//10+1+2+3
		System.out.println(reduced.getAsInt());
	System.out.println("============================");
	int reduce2=IntStream.range(1, 4).reduce(10,(a,b)->a+b);
	System.out.println(reduce2);
	
	System.out.println("============================");
	
	Integer reduce1=Arrays.asList(1,2,3).parallelStream().reduce(10, (a,b)->a+b, (a,b)->{
		System.out.println("combiner was called");
		return a+b;
	});
	//11,12,13=>11,12+13=25=>11+25=36
	System.out.println(reduce1);
	}
	}

