package com.capgemini.cust;


import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.SavingAccount2;
import com.capgemini.bank.SavingsAccount;

public class Customer {
	public static void main(String[] args){
		
		BankAccount acc=null;
		acc=new CurrentAccount();
		acc.withdraw(4000);
		SavingAccount2 save=new SavingAccount2();
		System.out.println(save.InsuranceAmount());
		
	}
}
