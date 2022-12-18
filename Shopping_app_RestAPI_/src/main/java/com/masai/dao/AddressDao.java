package com.masai.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

//	public Address findByCustomer(Customer customer);
	public List<Address>  findByState(String state);
}