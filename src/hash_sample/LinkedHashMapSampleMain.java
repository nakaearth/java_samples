package hash_sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSampleMain {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Map<String, String> map = new LinkedHashMap<>();
		for(int i = 0; i < 10000; i++) {
		    map.put("key" + i , "value" + i);
		    map.get("key" + i);
		}
		long endTime = System.nanoTime();
        System.out.println("Time:" + String.valueOf(endTime - startTime));
        System.out.println("========================================");
        
        System.out.println("===========Hash link table initialize=============");
	    startTime = System.nanoTime();
		Map<String, String> map2 = new LinkedHashMap<>(30);
		for(int i = 0; i < 10000; i++) {
			map2.put("key" + i , "value" + i);
			map2.get("key" + i);
		}
		endTime = System.nanoTime();
        System.out.println("Time:" + String.valueOf(endTime - startTime));
        System.out.println("========================================");
	}

}
