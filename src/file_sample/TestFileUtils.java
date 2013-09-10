package file_sample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileUtils {

	public static void main(String[] args) {
//		FileSystem fileSystem = FileSystems.getDefault();
//		Path path = fileSystem.getPath("test_reader_file.txt");// Pathオブジェクトの取得	
		Path source = Paths.get("./test_reader_file.txt");
		Path dest = Paths.get("./result.txt");
		try {
			Files.copy(source, dest);
			Files.move(dest, Paths.get("./tmp/bar/test_reader_2.txt"));
			BufferedWriter b_writer = Files.newBufferedWriter(source, Charset.defaultCharset());
			b_writer.write("test new io");
			System.out.println("---Test util ----");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
