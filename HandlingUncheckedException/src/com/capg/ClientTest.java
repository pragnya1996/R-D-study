package com.capg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {
		List<Integer> integer= Arrays.asList(3,6,9,0,20);
		integer.forEach(consumerWrapper(i->System.out.println(50/i),Exception.class));
		/*integer.forEach(i->{
			try{
				System.out.println(50/i);
			}catch(ArithmeticException e){
				System.out.println("Arithmetic Exception occured:"+e.getMessage());
			}
		});*/
	}
/*private static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer){
	return i->{
		try {
			consumer.accept(i);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured:"+e.getMessage());
		}
	};
}*/
	
	private static <T,E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer,Class<E> hello){
		return i->{
			try{
				consumer.accept(i);
			}catch(Exception e){
				e.printStackTrace();
			}
		};
		
		
	}
	}

