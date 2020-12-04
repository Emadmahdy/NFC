package com.cs631.nfc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cs631.nfc.beans.Customer;

@Repository
public interface UserRepository extends CrudRepository<Customer, Integer>{

	@Query("select u from User u where u.username= :name")
	public Customer searchByName(@Param("name") String username);
}
