package com.capg;
import java.util.Scanner;

public class BankAccount {
    int  accountId;
    String accountName;
    String IFSCcode;
double balance;
double amount ;

   public BankAccount (int accountId, String accountName, String IFSCcode, double balance){
    this. accountId = accountId;
    this. accountName = accountName;
    this.IFSCcode = IFSCcode;
this.balance=balance;
   }
    


    
    public int getAccountId() {
	return accountId;
}

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public String getIFSCcode() {
	return IFSCcode;
}

public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}




	@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", accountName="
			+ accountName + ", IFSCcode=" + IFSCcode + ", balance=" + balance
			+ "]";
}

//withdrawl money  and set daily withdrawl limit
	public void WithdrawMoney() {
 
		 System.out.println("your currentbalance="+balance);
		Scanner withDraw = new Scanner(System.in);
		 System.out.println("please enter the withdraw amount");
		balance -= amount ;
       
           final double setDailyLimit = 2500.00;     
          
            double WithdrawMoney =withDraw.nextDouble();


        if(balance < WithdrawMoney)
            System.out.println("you have less amount : your current balance is="+balance);

        else if (WithdrawMoney > setDailyLimit)
            System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

        else 
        	balance -= WithdrawMoney;
            System.out.println("your current balance is="+balance);

    }
	
	public void DepositAmount(){
		System.out.println("please enter the deposit amount");
		Scanner deposit = new Scanner(System.in);
		balance+=amount;
		System.out.println("your current balance is="+balance);
		
	}

    public static void main(String[] args){
    	BankAccount account = new BankAccount(1234455533,"samy","ICIC09",50000);
        System.out.println("you have created account : "+account);
   account.WithdrawMoney();
   //account.DepositAmount();

     
    }

}

