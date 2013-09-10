package enum_sample;

public class Human {
	
	enum Gender {
		MAN,
		WOMAN,
		OTHER }

	public void setGenderType(Gender gender) {
		if (gender == Gender.MAN) {
			System.out.println("男だ!");
		} else if(gender == Gender.WOMAN) {
			System.out.println("女だ");
		} else if (gender == Gender.OTHER) {
			System.out.println("秘密だ");
		} else {
			System.out.println("判断不明");
		}
	}
}
