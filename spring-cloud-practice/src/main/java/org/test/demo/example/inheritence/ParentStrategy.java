package org.test.demo.example.inheritence;

import org.springframework.stereotype.Component;

@Component
public class ParentStrategy extends AbstractClass{
	
	public void functionOne() {
		System.out.println("PARENt STRATEGY: Implementation of functionOne");
		methodThree();
		methodFour();
	}
	
	@Override
	public void methodThree() {
		System.out.println("PARENt STRATEGY: Implemetation for method three");
	}
	
	@Override
	public void methodFour() {
		System.out.println("PARENt STRATEGY: Implemetation for method four");
	}
}
