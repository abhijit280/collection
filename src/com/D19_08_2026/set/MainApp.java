package com.D19_08_2026.set;

import java.util.HashSet;

class Product {
	String name;

	Product(String name) {
		this.name = name;
	}

	public int hashCode() {
		return 1;

	}
}

public class MainApp {

	public static void main(String[] args) {

		HashSet<Product> p = new HashSet<Product>();
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));
		p.add(new Product("DAksh"));

	}
}
