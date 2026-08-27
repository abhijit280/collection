package com.D26_08_2026.concurantexception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Driver {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// this is the fail fast because while arraylist is in iteration and some changes happen it will throw exception 
		list.add("abhi");
		list.add("ashu");
		list.add("daksh");
		list.add("dipu");
		list.add("bapu");
		list.add("raja");
		List<String> itr1 = Collections.synchronizedList(list);
		Iterator<String> itr =  itr1.iterator();
		while (itr.hasNext()) {
			String names = itr.next();
			System.out.println(names);
			list.remove(3);	//it will throw exception
			itr.remove();	//it dont throw the exception
//			if (names == "bapu") {
//				list.remove(3);
//			}
			
		}
		System.out.println(list);
//		Map<Integer,String> list = new HashMap<Integer,String>();
//
//		list.put(10,"aa");
//		list.put(20,"aa");
//		list.put(30,"ab");
//		list.put(40,"aa");
//
//		boolean result;
//		for (int i = 0; i < list.size(); i++) {
//		    if (result =list.containsValue("ab")) {
//		      
//		    }
//		}
//		list.forEach((key,value) -> {
//			if (list.containsValue("ab")) {
//				list.remove(key);
//			}
//			System.out.println(key + " "+value);
//		});
//
//		System.out.println(list);
	}
}
