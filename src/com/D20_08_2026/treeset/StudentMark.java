package com.D20_08_2026.treeset;
import java.util.TreeSet;

public class StudentMark {

	public static void main(String[] args) {
		
		TreeSet<Integer> mark = new TreeSet<Integer>();
		mark.add(45);
		mark.add(85);
		mark.add(95);
		mark.add(76);
		mark.add(67);
		mark.add(89);
		mark.add(56);
		mark.add(67);
		
		System.out.println(mark);
		System.out.println("the Highest mark is :"+mark.last());
		System.out.println("the lowest mark is :"+mark.first());
		System.out.println("the mark 85 is present : "+mark.contains(85));
		System.out.println("i remove whose mark is 67 :"+mark.remove(67));
		System.out.println(mark);
		
	}

	
}
