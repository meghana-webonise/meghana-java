package com.weboniselab.meghana.java.assignment1;

public class MainAnimalClass {
	public static void main(String[] args) {

		// Assigning an object of superclass to subclass
		Animal puppy = new Dog();
		// Calling method eat of subclass Dog
		puppy.eat();
		// Calling overloaded method eat
		puppy.eat("vegetarian");
		// An object of subclass Dog is created
		Dog dog = new Dog(" ");
		// Calling method getSound of class Dog
		dog.getSound();
		// An object of class Dog is created to show case constructor
		// overloading
		Dog labrador = new Dog("Tommy");
		// Calling method sleep of class Dog
		labrador.sleep();
		// Calling getter of class Dog
		System.out.println(labrador.getName());
		// An object of subclass Cat is created
		Cat cat = new Cat();
		// Calling overloaded method eat
		cat.eat("nonVegetarian");

		// Trying to assign an object of subclass to superclass and accessing
		// it's method
		try {
			((Cat) puppy).eat();
		} catch (Exception e) {
			System.out
					.println("Creating an object of subclass of type superclass is not possible");
		}

		System.out.println(puppy instanceof Dog);
		System.out.println(cat instanceof Cat);
	}

}
