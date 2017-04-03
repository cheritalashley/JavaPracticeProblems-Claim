package Polymorphism;

// Program that uses Polymorphism to extend function of 2 classes - DOG and CAT class, and create new 
// methods to make sound of the different animals
// One method with different implementations
// 1-30-17

public class Animal {
	public void makeSound(){
		System.out.println("Grr...");
	}
	
	public static void main(String[] args) {
		Animal a=new Dog();
		Animal b=new Cat();
	
		a.makeSound();
		b.makeSound();
	}

	
}
