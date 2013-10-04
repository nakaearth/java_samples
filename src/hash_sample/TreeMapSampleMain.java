package hash_sample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSampleMain {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Map<String, String> map = new TreeMap<>();
		for(int i = 0; i < 10000; i++) {
		    map.put("key" + i , "value" + i);
		    map.get("key" + i);
		}
		long endTime = System.nanoTime();
        System.out.println("Time:" + String.valueOf(endTime - startTime));
        System.out.println("========================================");
	}

}