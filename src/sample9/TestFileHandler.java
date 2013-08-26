package sample9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class TestFileHandler {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("test_reader_file.txt");
			 Writer writer = new FileWriter("test_out.txt"); ) {
			int ch;
			while ((ch=reader.read() ) != -1) {
				writer.write(ch);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
