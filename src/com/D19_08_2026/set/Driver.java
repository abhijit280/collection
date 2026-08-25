package com.D19_08_2026.set;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		Set<BankDetails>bankDetails = new HashSet<BankDetails>();
		bankDetails.add(new BankDetails("abhi", 123123));
		bankDetails.add(new BankDetails("abhi", 123123));
		bankDetails.add(new BankDetails("abhi", 456456));
		bankDetails.add(new BankDetails("ashu", 123123));
		bankDetails.add(new BankDetails("abhi", 123123));
		bankDetails.add(new BankDetails("abhi", 456456));
		bankDetails.add(new BankDetails("ashu", 123123));
		bankDetails.add(new BankDetails("abhi", 123123));
		bankDetails.add(new BankDetails("abhi", 456456));
		bankDetails.add(new BankDetails("ashu", 123123));
		
		System.out.println(bankDetails);

	}

}
