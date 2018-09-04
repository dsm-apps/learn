package com.training.day6;

public class InterfaceReference {

	public static void main(String[] args) {
		ElectronicDevice1 ed = new Television1();
		ed.turnOn();
		ed.turnOff();
		Television1 tv = (Television1) ed;
		ed.changeChannel(2); // fails to compile as it is not in the interface.
		
		String s = ed.toString();
	}
}
