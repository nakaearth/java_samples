package set_sample;

import java.util.HashSet;
import java.util.Set;

public class TestSetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("abc");
		set.add("bcd");
		set.add("cde");
		set.add("defghi");
		boolean b1 = set.add("a");
		System.out.println(b1);
		boolean b2 = set.add("abc");
		System.out.println(b2);
		System.out.println("=============");
		for (String e : set) {
			System.out.println(e);
		}
	}
}
