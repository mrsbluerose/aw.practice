package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		//Map<String,Integer> map = new HashMap<>(); //Not ordered
		Map<String,Integer> map = new LinkedHashMap<>(); //order entered
		
		map.put("Mary", 70);
		map.put("Lacy", 80);
		map.put("Ariel", 90);
		map.put("Zena", 100);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys: " + keySet);
	}

}
