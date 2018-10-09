package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
 public static void main(String[] args){
	 List<String> list=new ArrayList<>();
	 list.add("pragnya");
	 list.add("dance");
	 list.add("music");
	 list.add("prabhu");
	 
	 /*Stream<String> stream=list.stream();
	 Stream<String> distinct=stream.distinct();
	 long count=distinct.count();*/
	 
	 long count=list.stream().distinct().count();
	 System.out.println(count);
	 boolean anyMatch=list.stream().anyMatch(s->s.contains("ra"));
	 System.out.println(anyMatch);
 }
}
