package com.D19_08_2026.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("abhi","ashu","abhi","daksh","daksh");
		DuplicateData data = new DuplicateData();
		Set<String > duplicates =  data.findDduplicates(names);
		System.out.println(duplicates);
	}

}
