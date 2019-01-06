package com.pmuz.service;

import java.util.List;

import com.pmuz.model.Customer;
import com.pmuz.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pmuz.service.CustomerService#findAll()
	 */
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
