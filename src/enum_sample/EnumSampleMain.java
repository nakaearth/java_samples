package enum_sample;

import enum_sample.Human.Gender;

public class EnumSampleMain {
	public static void main(String[] args) {
		Human human = new Human();
		System.out.println("-----Enum sample-------");
		human.setGenderType(Gender.MAN);
		System.out.println("-----Enum sample2-------");
		human.setGenderType(Gender.WOMAN);
	}
}
