package com.trainingapps.lenscartapp.customerms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trainingapps.lenscartapp.customerms.entity.Customer;
import com.trainingapps.lenscartapp.customerms.exceptions.CustomerNameAlreadyExistException;
import com.trainingapps.lenscartapp.customerms.exceptions.CustomerNotFoundException;
import com.trainingapps.lenscartapp.customerms.exceptions.WrongPasswordException;
import com.trainingapps.lenscartapp.customerms.exceptions.WrongUsernameAndPassword;

@Service
public interface ICustomerService {

	public Customer addCustomer(Customer customer) throws CustomerNameAlreadyExistException;

	public Customer getCustomerByName(String customerName) throws CustomerNotFoundException;

	public Customer loginCustomer(Customer customer) throws WrongPasswordException, WrongUsernameAndPassword;

	public Customer updateCustomer(Customer customer);

	public Customer getCustomerById(int customerId) throws CustomerNotFoundException;

	public List<Customer> deleteCustomer(int customerId) throws CustomerNotFoundException;

}