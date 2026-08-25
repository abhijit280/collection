package com.D11_08_2026.List;

public class Names {
	private String name;

	public Names(String name) {
		super();
		this.name = name;
	}
	private void getName() {
		System.out.println("name : "+name);
	}
	public void displayName() {
		getName();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
