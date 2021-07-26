package org.test.demo.example.inheritence;

public class IntermediateStrategy extends ParentStrategy {
	
	@Override
	public void methodThree() {
		System.out.println("CHILD STRATEGY: Implemetation for method three");
	}
	
	@Override
	public void methodFour() {
		System.out.println("CHILD STRATEGY: Implemetation for method four");
	}
}