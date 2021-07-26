package org.test.demo.example.inheritence;

public abstract class AbstractClass implements Implementatble {
	
	@Override
	public void abstractMethodOne() {
		System.out.println("ABSTRACT CLASS: Default abstractMethodOne");
	}
	
	@Override
	public void abstractMethodTwo() {
		System.out.println("ABSTRACT CLASS: Default abstractMethodTwo");
	}
	
	public abstract void methodThree();
	
	public abstract void methodFour();
	
	
}
