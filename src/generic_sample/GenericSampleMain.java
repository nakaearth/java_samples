package generic_sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericSampleMain {
	public static void main(String[] args) {
		List<Owner<String>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Owner<String> data = new Owner<>();
			data.put("hogehoge_" + String.valueOf(i));
			list.add(data);
		}
		for (Owner<String> value : list) {
			System.out.println(value.get());
		}

		List<Owner<Integer>> list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Owner<Integer> data = new Owner<>();
			data.put(Integer.valueOf(i));
			list2.add(data);
		}
		for (Owner<Integer> value : list2) {
			System.out.println(value.get());
		}
	}
}
