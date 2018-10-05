package com.parking.pojo;

public class Customer {
	
	String customerName;
	String phoneNo;
	String entryTime;
	
	
	

	public Customer(String customerName, String phoneNo,
			String entryTime) {
		super();
		
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.entryTime = entryTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}



	@Override
	public String toString() {
		return "Customer [ customerName=" + customerName + ", phoneNo=" + phoneNo + ", entryTime="
				+ entryTime + "]";
	}


	
	
	

}
