package com.D12_08_2026.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
	private String name;
	private int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public void doDisplay() {
		System.out.println("the name of the student is : "+name);
		System.out.println("the roll of the student is : "+roll);
	}
//	int hash ;
//	public int hashCodes(Object obj) {
//		
//		Student details = (Student) obj;
//		if (this.name.hashCode() == details.name.hashCode() || Integer.hashCode(this.roll) == Integer.hashCode(details.roll)) {
//			 hash =  this.name.hashCode();
//		}
//		return hash;
//	}
	@Override
	public int hashCode() {
		
		return this.name.hashCode() + Integer.hashCode(this.roll);
//		System.out.println(this.name.hashCode() + " "+Integer.hashCode(roll));
//		return Objects.hash(name,roll);
	}
	@Override
	public boolean equals(Object obj) {
		
		Student details = (Student)obj;
		return this.name .equals(details.name) && this.roll == details.roll;
	}
	@Override
	public String toString() {
		
		return "\n{name :" +name+"   " +"roll :" + roll+"}\n";
		
	}
}

public class Driver1 {
	public static void main(String[] args) {
		Set<Student> details = new HashSet<Student>();
		details.add(new Student("Abhijit", 101));
		details.add(new Student("Abhijit", 101));
		details.add(new Student("Abhijit", 101));
		details.add(new Student("Abhijit", 102));
		details.add(new Student("sunny", 101));
		
		Student student = new Student("abhi", 100);
		details.add(student);
		System.out.println(details);
		
	}
}
