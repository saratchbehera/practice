package com.sarat.designPatterns.creational_Design_Patterns.Factory;

//sub class 1 that might get instantiated by a factory method pattern
public class Dog implements Pet {
	
	public String speak() {
		return "Bark bark...";
	}
}
