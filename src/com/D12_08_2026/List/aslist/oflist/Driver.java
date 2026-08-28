package com.D12_08_2026.List.aslist.oflist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<String>list = Arrays.asList("a","b","c");
	//	list.add("d");// it will throw the UnsupportedOperationException because the array size is fixed.
	//	list.set(1, "B");//it will accept because it not changed the sized just replace
		
		
		List<String>list1 = new ArrayList<String>( Arrays.asList("a","b","c"));
		list1.add("d");		//it will add because the (ArrayList) is dynamic sized it is not a array
		list1.set(1, "B");
		System.out.println(list1);
		
		
		List<String>list2 = List.of("a","b","c");
		// it doesn't provide any facility to change anything it is an (immutable).introduced in java 9.
		
		
		List<String>list3 = new ArrayList<String>(List.of("a","b","c"));
		list3.add("d");		//it will add because the (ArrayList) is dynamic sized it is not a array
		list3.set(0, "A");
		System.out.println(list3);
	}

}
