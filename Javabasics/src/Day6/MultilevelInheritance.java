package Day6;

class Animal {

	void eat() {
		System.out.println("Animal Eats");
	}

}

class Dog extends Animal {

	void bark() {
		System.out.println("Dog Barks");
	}

}

class Puppy extends Dog {

	void play() {
		System.out.println("Puppy Plays");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {

		Puppy p = new Puppy();

		p.eat();
		p.bark();
		p.play();

	}

}