package interface_sample;

public class AnimalFactory {
	public static Animal createAnimal(String name) {
		if (name.equals("Dog")) {
			return new Dog();
		} else if (name.equals("Cat")) {
			return new Cat();
		}
		return null;
	}

}
