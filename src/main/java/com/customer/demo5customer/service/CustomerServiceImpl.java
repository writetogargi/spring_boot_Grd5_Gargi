package com.customer.demo5customer.service;


import com.customer.demo5customer.dao.CustomerRepository;
import com.customer.demo5customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    // need to inject customer dao
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {

        customerRepository.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {

        return customerRepository.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {

        customerRepository.deleteCustomer(theId);
    }


}
