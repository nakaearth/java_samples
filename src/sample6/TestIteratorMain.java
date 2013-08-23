package sample6;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIteratorMain {
	public static void main(String[] args) {
		ArrayList<TestData> testList = new ArrayList<>();
		for(int i = 0; i < 50; i++){
			TestData data = new TestData();
			data.setName("hoge");
			data.setAge(Integer.valueOf(20 + i));
			testList.add(data);
		}
		for (Iterator<TestData> iter = testList.iterator(); iter.hasNext(); ) {
			TestData value = iter.next();
			System.out.println("NAME:" + value.getName() + ", AGE:" + value.getAge());
		}
	}
}
