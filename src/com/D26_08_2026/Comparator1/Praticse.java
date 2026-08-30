package com.D26_08_2026.Comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Praticse {

	public static void main(String[] args) {

		List<Products> list = new ArrayList<Products>();
		list.add(new Products(123, "shoes", 2000));
		list.add(new Products(145, "book", 200));
		list.add(new Products(178, "Bag", 4000));
		list.add(new Products(189, "IPhone", 200000));
		list.add(new Products(156, "Laptop", 80000));

		Comparator<Products> compareByPrice = (x, y) -> Integer.compare(x.prdPrice, y.prdPrice);
		Comparator<Products> compareById = (x, y) -> Integer.compare(x.prdId, y.prdId);
		Comparator<Products> compareByPrdName = (x, y) -> x.prdName.compareTo(y.prdName);

		Collections.sort(list, compareById);

		Iterator<Products> itr = list.iterator();

		while (itr.hasNext()) {
			Products prd = itr.next();
			// System.out.println(prd.prdId +" , "+prd.prdName+" , "+prd.prdPrice);

		}
		// System.out.println(list);

		List<Products> list1 = list.stream().filter(x -> x.prdName.startsWith("b"/* .toUpperCase() */))
				.collect(Collectors.toList());
		// System.out.println(list1);
		Optional<Products> maxPrice = list.stream().max(Comparator.comparingInt(x -> x.prdPrice));
		// System.out.println(maxPrice);
		list.stream().filter(x -> (x.prdPrice > 2000)).map(x -> x.prdPrice - 1000).forEach(System.out::println);
	}

}
