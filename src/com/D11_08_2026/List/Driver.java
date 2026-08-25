package com.D11_08_2026.List;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ProcessingName name = new ProcessingName();
		ArrayList<Names> name2= name.processName();
		System.out.println(name2.get(2));
	}
}
