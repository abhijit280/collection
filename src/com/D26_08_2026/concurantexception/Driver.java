package com.D26_08_2026.concurantexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abhi");
		list.add("ashu");
		list.add("daksh");
		list.add("dipu");
		list.add("bapu");
		list.add("raja");
		
		Iterator<String> itr =  list.iterator();
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
	}
}
