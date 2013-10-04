package interface_sample;

public class InterfaceSampleMain02 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		animal.sayHello();

		Animal animal2 = AnimalFactory.createAnimal("Cat");
		animal2.eat();
		animal2.sayHello();
	}

}
