package com.capgemini;

public class Client implements I1,I2{
	
	public void display(){
		I1.super.display();
		I2.super.display();
	}

	public static void main(String[] args) {
		Client c=new Client();
		c.display();

	}

}
