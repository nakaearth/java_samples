package property_sample;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;


public class PropertySampleMain {

	public static void main(String[] args) {
		Properties conf = new Properties();
		try {
			conf.load(PropertySampleMain.class.getResourceAsStream("/test.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("db:" + conf.getProperty("db"));
		System.out.println("name:" + conf.getProperty("name"));
		System.out.println("url:" + conf.getProperty("url"));

		System.out.println("=========================");
		ResourceBundle rb = ResourceBundle.getBundle("test");
		for (Enumeration e = rb.getKeys(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			String val = rb.getString(key);
			System.out.println(key + ":" + val);
		}
	}

}
