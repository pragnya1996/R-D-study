package com.capgemin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClientTest {
public static void main(String[] args){
	List<Integer> numbers=Arrays.asList(4,9,18,10,5);
	//method reference
	numbers.forEach(System.out::println);
	System.out.println("==========================");
	
	//reference to a constructor
	
	List<Double> findSquareRoots=ClientTest.findSquareRoots(numbers,Integer::new);
	findSquareRoots.forEach(System.out::println);
}

private static List<Double> findSquareRoots(List<Integer> numbers, Function<Integer, Integer> f) {
	List<Double> results=new ArrayList<>();
	numbers.forEach(x->results.add(Math.sqrt(f.apply(x))));
	return results;
	
}
}
