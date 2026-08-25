package com.D11_08_2026.List;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		CityName cityName = new CityName();
		
		ArrayList<String>cities = cityName.getCityNames();
		
		cities.add(0, "Raoukela");
		System.out.println(cities);
		cityName.getCityNames().add(0, "chandighar");
		System.out.println(cityName.getCityNames());
		for (String city : cities) {
			
			if (city.startsWith("B")) {
				System.out.println(city);
			}
			
		}
	}

}
