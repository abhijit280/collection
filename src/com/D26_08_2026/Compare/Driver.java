package com.D26_08_2026.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		int result = Integer.compare(this.salary,o.salary);
		if (result == 0) {
			return this.salary;
		}
		return result;
	}
	public void display() {
		System.out.println("name of emp : "+name);
		System.out.println("salary of emp : "+salary);
		System.out.println();
	}
}
public class Driver {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("abhi", 15000));
		list.add(new Employee("ashu", 18000));
		list.add(new Employee("daksh", 19000));
		list.add(new Employee("ravi", 15500));
		list.add(new Employee("survi", 20000));
		list.add(new Employee("akash", 20000));
		
		Collections.sort(list);
		
		for (Employee emp : list) {
			emp.display();
			
		}
		
				

	}

}
