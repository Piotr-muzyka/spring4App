package com.pmuz.repository;

import java.util.ArrayList;
import java.util.List;

import com.pmuz.model.Customer;


public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pmuz.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Wojciech");
		customer.setLastname("Trabka");
		
		customers.add(customer);
		
		return customers;
	} 
}
