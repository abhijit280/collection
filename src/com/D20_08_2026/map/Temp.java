package com.D20_08_2026.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Temp {

	static ConcurrentHashMap<Integer, String> map =
            new ConcurrentHashMap<>();
	
	public static void main(String[] args) {
		
        Thread t1 = new Thread(() -> {
            map.put(101, "Abhi");
        });

        Thread t2 = new Thread(() -> {
            map.put(102, "Rahul");
        });

        t1.start();
        t2.start();

        System.out.println();
	}

}
