package com.cts.model;

import java.time.LocalDate;

public class Customer {

	private int customerID;
	private String name;
	private LocalDate dob;
	public double getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Customer(int customerID, String name, LocalDate dob) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.dob = dob;
	}
	public Customer() {
		super();
	}
	
}
