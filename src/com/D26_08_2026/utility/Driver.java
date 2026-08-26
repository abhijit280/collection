package com.D26_08_2026.utility;

import java.util.ArrayList;
import java.util.Collections;
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
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		List<String>unmodlist =  Collections.unmodifiableList(list);
	//	unmodlist.add("deepu");
	//	System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		List<String>syncList = Collections.synchronizedList(list);
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
