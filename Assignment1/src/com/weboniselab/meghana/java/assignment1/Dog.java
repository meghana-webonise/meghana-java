package com.weboniselab.meghana.java.assignment1;

public class Dog extends Animal {

	private String name;

	Dog() {
		super();
		System.out.println("New Dog");

	}

	// overloading the constructor
	Dog(String name) {

		try {
			if (name.equals(null) || name.equals("")) {
				System.out.println("Name cannot be null");
			} else

				this.name = name;
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {

		try {
			if (this.name.equals(null)) {
				System.out.println("Name cannot be null");
			}

		} catch (Exception e) {
			System.out.println("e");
		}
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("Dogs love pedigree");
	}

	public void sleep() {
		System.out.println("Each Dog has a different sleeping time");
	}

	public void getSound() {
		System.out.println("A Dog barks");
	}

}
