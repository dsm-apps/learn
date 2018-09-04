package com.training.day5;

import com.training.day5.inner.Car;

public class AnonymousClass {

	public Object o = new Object() {
		
		@Override
		public String toString() {
			return "In an anonymous class method";
		}
	};
	
}
