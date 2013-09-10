package file_sample;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileAttributeHandler {

	public static void main(String[] args) {
		FileSystem fileSystem = FileSystems.getDefault();
		Path path = fileSystem.getPath("./test_reader_file.txt");// Pathオブジェクトの取得
		BasicFileAttributeView attributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		try {
			FileTime createTime = attributeView.readAttributes().creationTime(); //File created_date
			System.out.println("File created time:" + createTime.toString());
			FileOwnerAttributeView ownerAttributeView = 
					Files.getFileAttributeView(path, FileOwnerAttributeView.class);
			System.out.println("File owner:" + ownerAttributeView.toString());
			UserPrincipal owner = ownerAttributeView.getOwner();
			System.out.println("owner info:" + owner.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
