package com.D20_08_2026.map;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String>map = new HashMap<Integer, String>();
		map.put(1, "abhi");
		map.put(1, "abhijit");
		map.put(2, "abhi");
		Map<String, Integer>map1 = new HashMap<String, Integer>();
		map1.put( "abhi",101);
		map1.put( "abhijit",101);
		map1.put("abhi",101);
		
	}

}
