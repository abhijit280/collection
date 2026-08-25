package com.D18_08_2026.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
//		Set<String> carName = new HashSet<String>();
//		carName.add("Toyota Supra M4");
//		carName.add("Dodge Challenger Black Hell Cat");
//		carName.add("Dodge Challenger Black  Hell Dog");
//		carName.add("Dodge Challenger Demon");
//		carName.add("BMW M4 Competion");
//		int hashcode = "Toyota Supra M4".hashCode();
//		int hashSpread = hashcode ^ (hashcode >>> 16);
//		int bucket = hashSpread & (16 - 1);
//		System.out.println("index num is : " + bucket);
//		System.out.println(carName.contains("BMW M4 Competion"));

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(52);
		num.add(51);
		num.add(51);
		num.add(54);
		num.add(55);
		num.add(56);
		num.add(57);
		num.add(58);
		num.add(59);
		num.add(52);
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num.add(52);
		num.add(51);
		num.add(51);
		num.add(54);
		num.add(55);
		num.add(56);
		num.add(57);
		num.add(58);
		num.add(59);
		num.add(52);

		HashSet<ArrayList> numb = new HashSet<ArrayList>();
		numb.add(num);
		System.out.println(numb);
		HashSet<Integer> number = new HashSet<Integer>(num);
		
		System.out.println(number);
	}

}
