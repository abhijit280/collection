package com.D26_08_2026.Comparator;

import java.util.Comparator;

public class ProductsCompaereByPrice implements Comparator<Products> {

	@Override
	public int compare(Products p1, Products p2) {
		int result = Integer.compare(p1.prdPrice, p2.prdPrice);
		if (result == 0) {
			return p1.prdPrice;
		}
		return result;
	}

}
