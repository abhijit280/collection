package com.D12_08_2026.set;

import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet<String>hashSet = new HashSet<String>(32);//default size of the hashset is 16
		//and it is not stored duplicate value
		int hash = "Abhi".hashCode();
		System.out.println(hash);
		int hashspread = hash ^ (hash >>> 16);
		int bucket = hashspread & (32 - 1);
		System.out.println("bucket is :"+bucket);
		hashSet.add("Abhi");
		
//		System.out.println(hashspread);
		
		
		hashSet.add("sahil");
		hashSet.add("ashu");
		hashSet.add("ayush");
		hashSet.add("nav");
		hashSet.add("sahil");
		System.out.println(hashSet);
	}
}
