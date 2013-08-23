package sample2;

import java.io.IOException;

public class TestExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestFileUtil util = new TestFileUtil();
		try {
			util.getData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		util.getData2();
	}
}
