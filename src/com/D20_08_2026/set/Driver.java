package com.D20_08_2026.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Names{
	private String name;
	public Names(String name) {
		this.name =name;
	}
	public int hashCode() {
		return 85852;
	}
	
}
public class Driver {

	public static void main(String[] args) {
		Set<Names> names = new LinkedHashSet<Names>();
//		System.out.println("krishu".hashCode());
//		System.out.println("pradhan".hashCode());
		names.add(new Names("abhijit"));
		names.add(new Names("gfd"));
		names.add(new Names("abgdfhdgsfhijit"));
		names.add(new Names("trge"));
		names.add(new Names("abhtrhgijit"));
		names.add(new Names("fjgdfhdgs"));
		names.add(new Names("hgfd"));
		names.add(new Names("ert"));
		names.add(new Names("waaetsrdt"));
		names.add(new Names("retrdtf"));
		names.add(new Names("saffdgfhg"));
		names.add(new Names("gdthrg"));

//		names.add("abhijit");
//		names.add("ashu");
//		names.add("daksh");
//		names.add("krishu");
//		names.add("abhi");
//		names.add("pradhan");
//		names.add("khudf");
//		names.add("hbf");
//		names.add("erwgsd");
//		names.add("ghg");
//		names.add("gdrhf");
		System.out.println(names);
		

	}

}
