package sample2;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("I eat a dog food.");
	}

	@Override
	public void sayHello() {
		System.out.println("WON WON!");
	}
}
