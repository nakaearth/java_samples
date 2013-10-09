package file_sample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileHandlerSampleMain {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("test_reader_file.txt");
				Writer writer = new FileWriter("test_out.txt");) {
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ファイルを読み込みコンソールに出力
		try (InputStream reader = new FileInputStream("test_reader_file2.txt");
				OutputStreamWriter writer = new OutputStreamWriter(System.out);) {
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----Buffered------");
		try (BufferedReader reader = new BufferedReader(new FileReader("test_reader_file3.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("test_out3.txt"));) {
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ファイルを読み込みコンソールに出力
		try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream("test_reader_file4.txt"));
				BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("test_out4.txt"));) {
			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
