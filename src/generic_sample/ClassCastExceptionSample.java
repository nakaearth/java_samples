package generic_sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExceptionSample {

	public static void main(String[] args) {
		List list3 = new ArrayList();
		list3.add("STRING");
		list3.add(Integer.valueOf(1000));
		list3.add(new Owner());

		// Listの中身が全部String型でないからClassExceptionが発生する
		for (Iterator iterator = list3.iterator(); iterator.hasNext();) {
			String value = (String)iterator.next();
			System.out.println(value);
		}
	}
}
