package com.training.day5;

public class AnonymousClass {

	public Object o = new Object() {
		
		@Override
		public String toString() {
			return "In an anonymous class method";
		}
	};
	
}
