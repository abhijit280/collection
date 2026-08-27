package com.D26_08_2026.Comparator;

import java.util.Comparator;

public class CompareByPrdName implements Comparator<Products> {
	@Override
	public int compare(Products p1, Products p2) {
		int result = p1.prdName.compareTo(p2.prdName);
//		if (result == 0) {
//			return Integer.compare(p1.prdPrice, p2.prdPrice);
//		}
		return result;
	}
}
