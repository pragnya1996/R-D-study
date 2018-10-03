package com.capgemini.bank;

public class SavingAccount2 extends SavingsAccount implements Insurance{

	@Override
	public String InsuranceName() {
		return "prabhu";
	}

	@Override
	public String InsuranceType() {
	
		return "premium";
	}

	@Override
	public double InsuranceAmount() {
		return 50000;
	}

}
