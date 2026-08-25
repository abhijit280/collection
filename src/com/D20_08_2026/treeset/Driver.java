package com.D20_08_2026.treeset;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	private String name;
	private int id;

	public Employee( int id,String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee emp) {
		//Employee employee = (Employee) o;
		//return this.name.compareTo(employee.name);
		int result = Integer.compare(this.id, emp.id);
		System.out.println(this.id + ","+ emp.id +"="+result);
		return result;
	}

	@Override
	public String toString() {
		return id + ":-"+name +"\n";
	}

}

public class Driver {

	public static void main(String[] args) {
		Set<Employee> names = new TreeSet<Employee>();
		names.add(new Employee(100,"abhi"));
		names.add(new Employee(101,"jeet"));
		names.add(new Employee(99,"pradhan"));
		names.add(new Employee(48,"ashu"));
		names.add(new Employee(32,"ashu"));
		names.add(new Employee(32,"ravi"));
//		names.add("abhi");
//		names.add("abhisekh");
//		names.add("abhinash");
//		names.add("ashu");
//		names.add("Ashutosh");
//		names.add("Dakshb");
//		names.add("daksha");
		System.out.println(names);

	}

}
