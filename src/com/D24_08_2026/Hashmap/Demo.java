package com.D24_08_2026.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class User {
	int id;
	String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("User Id : " + id + ", " + "User name : " + name);
	}
	public int hashCode() {
		return this.id;
	}
	public boolean equals(Object obj) {
		User user = (User) obj;
		return this.id == user.id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		Map<User, String> map = new HashMap<User, String>();
		User u1 = new User(101, "Ayush");
		User u2 = new User(102, "papu");
		User u3 = new User(103, "abhijit");
		User u4 = new User(102, "abhijit");
		User u5 = new User(105, "Ashu");
		map.put(u1, u1.name);
		map.put(u2, u2.name);
		map.put(u3, u3.name);
		map.put(u4, u4.name);
		map.put(u5, u5.name);
		

		Set<Entry<User, String>> entry = map.entrySet();
		Iterator<Entry<User, String>> itr = entry.iterator();
		while (itr.hasNext()) {
			Map.Entry<User, String> entry2 = itr.next();
			//System.out.println(entry2.getKey()+" ,"+entry2.getValue());
//			entry2.getKey().display();
//			System.out.println(entry2.getValue());
//			if (entry2.getValue().startsWith("a")) {
//				System.err.println(entry2.getValue());
//			}

		}
		u5.name = map.compute(u5,(key,value) -> (u5.name .equals( "ashu"))? "topper" : u5.name.concat(" mallick"));
		
		//the compute method works 
		System.out.println(u5.name);
		//System.out.println(map);
	}

}
