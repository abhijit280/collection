package com.D18_08_2026.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		Set<String>set = new HashSet<String>();
		set.add("hfbgd1");
		set.add("hfbgd2");
		set.add("hfbgd3");
		set.add("hfbgd4");
		set.add("hfbgd5");
		set.add("hfbgd6");
		set.add("hfbgd7");
		set.add("hfbgd8");
		set.add("hfbgd9");
		set.add("hfbgd10");
		set.add("hfbgd11");
		set.add("hfbgd12");//when the default set size (16) if full by 75% then the hashset size is increased by 2X and 
		set.add("hfbgd13");//the all element are stored before the capacity increase the element are go through the Rehashing process 
		set.add("hfbgd14");//and the all elements are may moved another index so its very expensive  
		set.add("hfbgd15");//so the rightful choice is the . You declare the set size 1st.
	//	System.out.println(set);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "abhi");
		map.put(101, "abhi");
		map.put(102, "abhi");
		map.put(103, "abhi");
		map.put(104, "abhi");
		map.put(105, "abhi");
		map.put(106, "abhi");
		map.put(107, "abhic");
		map.put(108, "abhi");
		System.out.println(map.get(107));
	//	System.out.println(map);
		TreeSet<String>treeSet = new TreeSet<String>();
		treeSet.add("abhi1");
		treeSet.add("abhi2");
		treeSet.add("abhi3");
		treeSet.add("abhi4");
		treeSet.add("abhi5");
		treeSet.add("abhi6");
		treeSet.add("abhi7");
		treeSet.add("abhi8");
		treeSet.add("abhi9");
		treeSet.add("abhi10");
		treeSet.add("abhi11");
		treeSet.add("abhi12");
		treeSet.add("abhi13");
		treeSet.add("abhi14");
		treeSet.add("abhi15");
		treeSet.add("abhi16");
		treeSet.add("abhi17");
		treeSet.add("abhi18");
		treeSet.add("abhi19");
	//	System.out.println(treeSet);
	}
	
	
	

}
