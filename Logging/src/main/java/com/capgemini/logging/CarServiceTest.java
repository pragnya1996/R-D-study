package com.capgemini.logging;

import org.junit.Test;

public class CarServiceTest {

	@Test
	public void shoulddemonstrateLogging(){
		CarService carService=new CarService();
		carService.process("BMW");
		
	}
	
}
