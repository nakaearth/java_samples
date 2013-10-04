package property_sample;


public class PropertySampleReader {

	public static void main(String[] args) {
		PropertyReader reader = new PropertyReader();
		reader.reader();
		System.out.println("Name:" + reader.getValue("name"));
		System.out.println("DB:" + reader.getValue("db"));
		System.out.println("URL:" + reader.getValue("url"));
		
	}

}
