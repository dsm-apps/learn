package com.training.day5;

public class StaticExample {

	public static void main(String[] args) {
		//System.out.println("Bala");
		
		
		StaticImpl.printSomething();
		
		//new .printSomething();
		
		new StaticImpl();
		new StaticImpl();
		new StaticImpl();
		new StaticImpl();
		new StaticImpl();
		new StaticImpl();
		new StaticImpl();
		
		
		StaticImpl impl1 = new StaticImpl();
		impl1.name = "Bala";
		impl1.lastName = "M";
		impl1.printFromNonStatic();
		
		
		
		StaticImpl impl2 = new StaticImpl();
		impl2.name = "Nischal";
		impl2.lastName = "N";
		impl2.printFromNonStatic();
				
		
		impl1.printFromNonStatic();
	}
	
}


class StaticImpl {
	
	public static String name;
	public String lastName;
	
	public static void printSomething() {
		System.out.println("Printing Something");
	}
	
	
	public void printFromNonStatic() {
		System.out.println( name + "--" + lastName  );
	}
	
}