package com.D18_08_2026.set;

import java.util.HashSet;

public class Driver1 {
	public static void main(String[] args) {
		HashSet<Company> companies = new HashSet<Company>();
		companies.add(new Company(101, "abhi", "abhi@g.com"));
		companies.add(new Company(102, "ashu", "abhi@g.com"));
		companies.add(new Company(103, "ayush", "ayush@g.com"));
		companies.add(new Company(103, "ayush", "ayutugtsh5@g.com"));
		System.out.println(companies);

	}
}

class Company {
	private int employeeId;
	private String name;
	private String email;

	public Company(int employeeId, String name, String email) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {

		Company com = (Company) obj;

		return this.employeeId == com.employeeId || this.email.equals(com.email);
	}

	@Override
	public int hashCode() {
//		if (Integer.hashCode(this.employeeId) == ) {
//			
//		}
		return Integer.hashCode(this.employeeId)
		       & this.email.hashCode();    /*Objects.hash(employeeId, email);*/
	}

	@Override
	public String toString() {
		return "{employeeId=" + employeeId + ", name=" + name + ", email=" + email + "}";
	}
}
