package sample2;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		animal.sayHello();

		Animal animal2 = AnimalFactory.createAnimal("Cat");
		animal2.eat();
		animal2.sayHello();
	}

}
