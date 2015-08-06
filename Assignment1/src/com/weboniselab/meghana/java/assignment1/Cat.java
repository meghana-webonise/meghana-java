package com.weboniselab.meghana.java.assignment1;

public class Cat extends Animal {

	private String name;

	Cat() {
		super();
		System.out.println("New Cat");

	}

	// overloading constructor
	Cat(String name) {

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
		return this.name;

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
		System.out.println("Cats love milk");
	}

	public void sleep() {
		System.out.println("Each Cat has a different sleeping time");
	}

	public void getSound() {
		System.out.println("A Cat meows");
	}

}
