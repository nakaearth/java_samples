package class_sample;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
        dog.execute();
        Cat cat = new Cat();
        cat.execute();
        
        Animal animal = new Dog();
        animal.execute();
	}
}
