package com.pmuz.service;

import java.util.List;

import com.pmuz.model.Customer;
import com.pmuz.repository.CustomerRepository;
import com.pmuz.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
			
	/* (non-Javadoc)
	 * @see com.pmuz.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
