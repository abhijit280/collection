package com.D26_08_2026.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

class Employee implements Comparable<Employee> {
	String name;
	int empId;
	int salary;

	public Employee(String name, int empid, int salary) {
		this.name = name;
		this.empId = empid;
		this.salary = salary;

	}

	public void display() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee salary : " + salary);
	}

	@Override
	public int compareTo(Employee o) {
		int result = Integer.compare(this.empId, o.empId);
		return result;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

}

public class CollectionsMethod {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		List<Integer> Id = new ArrayList<Integer>();
		list.add(new Employee("abhi", 123456, 10000));
		list.add(new Employee("papu", 485128, 15000));
		list.add(new Employee("ashu", 441544, 18000));

//		Iterator<Employee>itr =  list.iterator();
//		while (itr.hasNext()) {
//			Employee employees = itr.next();
//			Id.add(employees.empId);
//		}
//		
//		Collections.sort(Id);
//		
//		Iterator<Integer> itr2 = Id.listIterator();
//
//		while (itr2.hasNext()) {
//
//		    Integer employeeId = itr2.next();
//
//		    Iterator<Employee> itr3 = list.iterator();
//
//		    while (itr3.hasNext()) {
//
//		        Employee employee = itr3.next();
//
//		        if (employee.empId == employeeId) {
//		            employee.display();
//		        }
//		    }
//		}
//		
		Collections.sort(list);// it using internally comparable and comparator
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.synchronizedList(list);// it became the thread safe but slow because one thread is allowing perform
											// task at a time.
		List<Employee> unmodlist = Collections.unmodifiableList(list);// it doesnt allow the unmodifiable list to modify
																		// it throw UnsupportedOperationException.
//		unmodlist.add(new Employee("abhi", 52852, 80000));
		System.out.println(list);

	}

}
