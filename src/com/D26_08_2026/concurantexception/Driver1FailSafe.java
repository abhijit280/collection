package com.D26_08_2026.concurantexception;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver1FailSafe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
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
			
			if (names == "bapu") {
				list.remove(3);
			}
			
		}
		System.out.println(list);

	}

}
