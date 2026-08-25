package com.D12_08_2026.set;

import java.util.Set;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		
		Set<String>set = new HashSet<String>(100);
//		System.out.println("index  : "+("abhi".hashCode() & (16 - 1)));
		set.add("prabhu");
		System.out.println("prabhu".hashCode());
		int hash = "prabhu".hashCode();
		int hashspread = hash ^ (hash >>> 16);
		int hashspread1 = hash ^ (hash >>> 64);
		System.out.println(hashspread);
		System.out.println(hashspread1);
		int bucket = hashspread & (16 - 1);
		int bucket2 = hashspread & (64 - 1);
		System.out.println("index in 16 size : "+bucket);
		System.out.println("index in 32 size : "+bucket2);		
		

	}

}
