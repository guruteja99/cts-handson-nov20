package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.Customer;

@Service
public class CustomerService {

	List<Customer> customers = new ArrayList<>();

	public Customer addCustomer(Customer customer) {
		customer.setCustomerID(new Double(Math.random()*1000).intValue());
		customers.add(customer);
		return customer;
	}
	public List<Customer> fetchCustomers(){
		return customers;
	}
	public Customer fetcCustomer(int id) {
		return customers.stream().filter(item->item.getCustomerID()==id).findAny().get();
	}
	
}
