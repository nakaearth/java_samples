package sample3;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---ArrayList Test---");
		long startTime = System.nanoTime();
		ArrayList<String> testList = new ArrayList<>();
		for(int i = 0; i < 10000; i++){
			testList.add("hogehoge" + i);
		}
		long endTime = System.nanoTime();
        System.out.println("Insert TIME:" + String.valueOf(endTime- startTime));
        
        startTime = System.nanoTime();
        for(int j = 0; j < testList.size(); j++){
        	String value = testList.get(j);
        }
        endTime = System.nanoTime();
        System.out.println("Select TIME:" + String.valueOf(endTime- startTime));
       
        startTime = System.nanoTime();
        for(int j = 0; j < testList.size(); j++){
        	testList.remove(j);
        }
        endTime = System.nanoTime();
        System.out.println("Remove TIME:" + String.valueOf(endTime- startTime));
        
        System.out.println("=========================");
		System.out.println("---LinkedList Test---");
		startTime = System.nanoTime();
		LinkedList<String> testList2 = new LinkedList<>();
		for(int i = 0; i < 10000; i++){
			testList2.add("hogehoge" + i);
		}
		endTime = System.nanoTime();
        System.out.println("Insert TIME:" + String.valueOf(endTime- startTime));
        
        startTime = System.nanoTime();
        for(int j = 0; j < testList2.size(); j++){
        	String value = testList2.get(j);
        }
        endTime = System.nanoTime();
        System.out.println("Select TIME:" + String.valueOf(endTime- startTime));
        
        startTime = System.nanoTime();
        for(int j = 0; j < testList2.size(); j++){
        	testList2.remove(j);
        }
        endTime = System.nanoTime();
        System.out.println("Remove TIME:" + String.valueOf(endTime- startTime));
	}
}
