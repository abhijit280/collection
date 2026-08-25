package com.D19_08_2026.set;

public class BankDetails {
	private String name;
	private int accNo;

	public BankDetails(String name, int accNo) {
		this.name = name;
		this.accNo = accNo;
	}

	public int hashCode() {
		return 85259596; //this.accNo + this.name.hashCode();
	}

//	public boolean equals(Object Obj) {
//		BankDetails bankDetails = (BankDetails) Obj;
//		return this.name.equals(bankDetails.name) & this.accNo == bankDetails.accNo;
//	}
	public String toString() {
		return "{"+ name + " ,"+accNo +"}";
	}
}
