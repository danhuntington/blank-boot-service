package com.huntington.cdo.techyouth.customerservice.service;

import com.huntington.cdo.techyouth.customerservice.model.Customer;

public interface CustomerService
{
	Customer getCustomer(String customerId);
	Customer updateCustomer(Customer customer);
	Customer addCustomer(Customer customer);
	void deleteCustomer(String customerId);
}
