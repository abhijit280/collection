package com.D10_08_2026.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String>names = new  ArrayList<String>();// Default size of Arraylist is 10 ....when add 11 element it will increase by 50%....
		names.add("abhijit pradhan");//add object in ordered 
		names.add("Biswojeet pradhan");
		names.add("bishal pradhan");
		names.add("arijit pradhan");
		names.add("krishna awasthi");
		names.add("abhijit pradhan");
		names.add("Biswojeet pradhan");
		names.add("bishal pradhan");
		names.add("arijit pradhan");
		names.add("krishna awasthi");
		names.trimToSize();//this method is used for trim the default arraylist size to actual size
//		System.out.println(names);
//		
//		System.out.println(names.get(4));
//		
//		names.addLast("Papu pradhan");//it will add the object in the last index
//		
//		System.out.println(names);
//		
//		names.add(6,"Papu pradhan");//it will add the object with index based
//		
//		System.out.println(names);
//		
//		names.set(1, "Dipu pradhan");//set it change the data where index is one.
		
	//	System.out.println(names);
		for (String name : names) {			//for each loop for get the object with a method finding starts with "a"
			if (name.startsWith("a") || name.endsWith("n")) {
				System.out.println(name);
			}
			
		}
		System.out.println("......................Driver.main()..................");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
			
		boolean s = names.contains("abhijit pradhan");
		System.out.println(s);
		names.clear();			//it clear the list names the list is empty.
		System.out.println(names.isEmpty());//this is the proof the names list is empty
		System.out.println(names);
		names.add("abhijit");
		System.out.println(names);
		System.out.println(names.isEmpty());
		
		

	}

}
