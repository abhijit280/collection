package com.D12_08_2026.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("abhijit");
		names.add("avinav");
		names.add("sanath");
		names.add("abhisekh");
		names.add("sanath");
		names.add("sandeep");
		System.out.println(names);
		System.out.println(names.remove(String.valueOf("sanath")));
		System.out.println(names.get(2));
//		names.add(3, "kartik");
		System.out.println(names);
		
	}
}
