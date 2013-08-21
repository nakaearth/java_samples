package sample2;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("I eat a cat food.");
	}

	@Override
	public void sayHello() {
		System.out.println("NYA- NYA-");
	}

}
