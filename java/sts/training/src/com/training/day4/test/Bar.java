package com.training.day4.test;

import com.training.day4.demo.Foo;

public class Bar extends Foo {
	private int sum = 10;
	private int resultOne = 30;
	
	public void reportSum() {
		sum += result;
		sum += other;   // ********* compilation error ***********  other is not protected variable//
	}
	
	public void reportSumFieldShadowing() {
		sum += resultOne; // this is field shadowing - same variable in subclass so super class ignored.
	}
	
}
