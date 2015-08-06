package com.weboniselab.meghana.java.assignment1;

public abstract class Animal {

	Animal() {
		System.out.println("New Animal");
	}

	public void eat() {
		System.out.println("An animal eats");
	}

	// overloading the method eat
	public void eat(String type) {

		if (type.equals("vegetarian"))
			System.out.println("Animal is vegetarian");
		else if (type.equals("nonVegetarian"))
			System.out.println("Animal is non-Vegetarian");
		else
			System.out.println("Undefined type of Animal");

	}

	abstract void sleep();

	abstract void getSound();

}
