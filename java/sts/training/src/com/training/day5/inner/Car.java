package com.training.day5.inner;

public class Car {

	private boolean running =false;
	private Engine engine = new Engine();
	
	public void start() {
		engine.start();
	}
	
	private class Engine {
		public void start() {
			running = true;
		}
	}
}
