package com.capgemini.testing.CarTest;

public class Engine {
	private boolean running;
	
	public boolean isRunning(){
		return running;
	}
	
	public void start(){
		running=true;
	}
	
	public void stop(){
		running=false;
	}

}