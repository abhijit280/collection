package com.D26_08_2026.Comparator1;

public class Products {

	public int prdId;
	public String prdName;
	public int prdPrice;
	public Products(int prdId, String prdName, int prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Products [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
}
