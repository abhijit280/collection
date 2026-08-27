package com.D26_08_2026.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Products>list = new ArrayList<Products>();
		list.add(new Products("shirt", 258));
		list.add(new Products("jeans", 5000));
		list.add(new Products("shorts", 200));
		list.add(new Products("formal shirt", 545));
		list.add(new Products("shoes", 5800));
		
		Collections.sort(list,new CompareByPrdName());
		
		for (Products prd : list) {
			System.out.println(prd.prdName+" , "+prd.prdPrice);
		}
	}

}
