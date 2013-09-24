package exception_sample;

import java.io.IOException;

public class ExceptionTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			try {
				throw new IOException();
			} catch(NullPointerException npe) {
				System.out.println("NULL POINT");
			} finally {
				System.out.println("finally 1");
			}
		} catch (IOException ie) {
			System.out.println("IOEXCEPTION CATCH");
		} finally {
			System.out.println("finally 2");
		}
	}

}
