package com.customer.demo5customer.dao;


import com.customer.demo5customer.model.Customer;

import java.util.List;

public interface CustomerRepository {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}

