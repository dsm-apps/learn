package com.training.day5;

public class Television extends ElectronicDevice {

	@Override
	public void turnOn() {
		this.changeChannel(1);
		this.initializeScreen();
	}

	@Override
	public void turnOff() {
	}
	
	public void changeChannel(int channel) {}
	public void initializeScreen() {}

}
