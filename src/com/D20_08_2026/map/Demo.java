package com.D20_08_2026.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


class Employee{
	
}
public class Demo {

	public static void main(String[] args) {
		Map<Integer, Employee>map = new ConcurrentHashMap<Integer, Employee>();
		//it uses internally compare and swap so it doesnt allow the null value beacause it compare the object and compare the null with other is give exception 
		Employee e = null;
		map.put(1, e);
		//map.put(null, "abhijit");
		//map.put(2, "abhi");
		Map<String, Integer>map1 = new HashMap<String, Integer>();
		map1.put( "abhi",101);
		map1.put( "abhijit",101);
		map1.put("abhi",101);
		System.out.println(map);
	}

}
