package property_sample;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private Properties conf = null;
	
	public void reader(){
	    conf = new Properties();
		try {
			conf.load(this.getClass().getResourceAsStream("/test.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getValue(String key) {
		return conf.getProperty(key);
	}
}
