package interface_sample;

import java.io.File;
import java.io.IOException;

public class TestFileUtil {
	
	public void getData() throws IOException{
		File file = new File("test.txt");
		file.createNewFile();
	}
	
	public void getData2(){
		File file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
