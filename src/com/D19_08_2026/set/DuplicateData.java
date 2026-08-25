package com.D19_08_2026.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateData {
	public Set<String> findDduplicates(List<String>names){
		Set<String>seen = new HashSet<String>();
		Set<String>duplicates = new HashSet<String>();
		for (String name : names) {
			if (!seen.add(name)) {
				duplicates.add(name);
			}
		}
		
		return duplicates ;
		
	}
}
