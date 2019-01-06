package com.pmuz.repository;

import java.util.List;

import com.pmuz.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}