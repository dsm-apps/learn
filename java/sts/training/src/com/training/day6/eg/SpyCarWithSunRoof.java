package com.training.day6.eg;

public class SpyCarWithSunRoof {
	private BasicCar car = new BasicCar();
	private SpyCarAddon spyAddon = new SpyCarAddon();
	private SunRoofAddon roofAddon = new SunRoofAddon();
	
	public void start() {
		car.start(); // method forwarding
	}
	
	// other forwarded methods.
}
