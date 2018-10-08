package com.capgemini;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args){
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		//Runnable command=()->System.out.println("My task is running");
		
		//method reference to a static method
		Runnable command=ClientTest::myRun;
		executorService.execute(command);
	}
	
	private static void myRun(){
		System.out.println("My task is running");
	}
}
