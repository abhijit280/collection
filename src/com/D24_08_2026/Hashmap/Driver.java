package com.D24_08_2026.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("abhi");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abhi");
		map.put(2, "jit");
		map.put(3, "ashu");
		map.put(4, "raja");
		map.put(5, "papu");
		map.put(6, "dipu");
		map.put(7, "gupu");
		map.put(8, "bishal");
		map.put(null, "pradhan");
		System.out.println("hash map :unOrdered unique-->" + map);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "abhi");
		linkedHashMap.put(2, "jit");
		linkedHashMap.put(3, "ashu");
		linkedHashMap.put(4, "raja");
		linkedHashMap.put(5, "papu");
		linkedHashMap.put(6, "dipu");
		linkedHashMap.put(7, "gupu");
		linkedHashMap.put(8, "bishal");
		linkedHashMap.put(null, "pradhan");
		System.out.println("LinkedHash map :Ordered unique-->" + linkedHashMap);

		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "abhi");
		treeMap.put(9, "pradhan");
		treeMap.put(2, "jit");
		treeMap.put(3, "ashu");
		treeMap.put(4, "raja");
		treeMap.put(7, "gupu");
		treeMap.put(8, "bishal");
		treeMap.put(5, "papu");
		treeMap.put(6, "dipu");

		System.out.println("tree map :Sorted unique-->" + treeMap);
		Set<Entry<Integer, String>> maptoset = treeMap.entrySet();
		Iterator<Entry<Integer, String>> itr = maptoset.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("map : "+entry.getKey() + " and "+"value :"+entry.getValue());
			System.out.println(entry       );

		}

	}

}
