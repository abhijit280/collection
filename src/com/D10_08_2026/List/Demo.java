package com.D10_08_2026.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer>numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		//numbers.trimToSize();
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);
		numbers.remove(Integer.valueOf(20));
		numbers.remove(Integer.valueOf(20));
		numbers.remove(Integer.valueOf(20));
		System.out.println(numbers);
		
//		System.out.println(numbers);
//		System.out.println(numbers.get(2));
//		numbers.set(1, 200);
//		System.out.println(numbers);
//		numbers.remove(2);
//		System.out.println(numbers);
//		System.out.println(numbers.contains(50));
//		numbers.clear();
//		System.out.println(numbers.isEmpty());
//		numbers.add(1, 100);
//		System.out.println(numbers);
//		for (Integer number : numbers) {
//			System.out.println(number);
//		}
//		ArrayList<Integer>evenNum = new ArrayList<Integer>();
//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i) %2 == 0) {
//				evenNum.add(numbers.get(i));
//			}
//			//System.out.println(numbers.get(i));	
//		}
//		System.out.println("even : "+evenNum);
//		ArrayList<Integer>grtnum = new ArrayList<Integer>();
//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i)>20) {
//				grtnum.add(numbers.get(i));
//			}	
//		}
//		System.out.println("greater : "+grtnum);
//		numbers.add(2,200);
//		int num1 = 0;
//		for (Integer num : numbers) {
//			
//			if (num1 < num) {
//				num1 = num;
//			}
//		}
//		System.out.println("total : "+num1);
//		numbers.addFirst(20);
//		System.out.println(numbers);
//		int num1 = numbers.get(0);
//		for (Integer num : numbers) {
//			
//			if (num1 > num) {
//				num1 = num;
//			}
//		}
//		System.out.println("total : "+num1);
//		int num1 = 0;
//		for (Integer num : numbers) {
//			
//			if (20 == num) {
//				num1++;
//			}
//		}
//		System.out.println("total : "+num1);

//		if (numbers.contains(20) == true) {
//			System.out.println("element found");
//		}
//		else {
//			System.out.println("element not found");
//		}
//		System.out.println(numbers);
//		for (int i = numbers.size() - 1; i >= 0; i--) {//this is print the reverse of arraylist not change the actual array list
//		    System.out.println(numbers.get(i));
//		}
//		Collections.reverse(numbers);					//this is reverse the numbers array list .its change the actual array list.
//		System.out.println(numbers);
//		System.out.println(numbers.get(0));
		
		ArrayList<String>lang = new ArrayList<String>();
		lang.add("java");
		lang.add("python");
		lang.add("C");
		lang.add("C++");
		System.out.println(lang);
		
		
		
	}
}
