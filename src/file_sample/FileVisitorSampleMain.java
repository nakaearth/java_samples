package file_sample;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileVisitorSampleMain {

	public static void main(String[] args) {
//		String fileName = "READ";
		String fileName = "test";
		FileSystem fileSystem = FileSystems.getDefault();
		Path root = fileSystem.getPath("./");
		
		final Pattern pattern = Pattern.compile(fileName);
		
		FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
				Matcher matcher = pattern.matcher(file.toString());
				if (matcher.find()) {
					//マッチしたら、表示
					System.out.println(file);
				}
				return FileVisitResult.CONTINUE;
//				return FileVisitResult.SKIP_SUBTREE;
				// http://docs.oracle.com/javase/jp/7/api/java/nio/file/FileVisitResult.html
			}
		};
		try {
			Files.walkFileTree(root, visitor);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
