package com.capg.test;

public class Test {

	public static void main(String[] args) {
		MyComparator comparator=(n1,n2)->n1>n2;
		boolean compare=comparator.compare(40, 20);
		System.out.println(compare);

	}

}
