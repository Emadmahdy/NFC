package com.cs631.nfc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs631.nfc.beans.Customer;

@Repository
public interface CustomerOnlyRepository extends CrudRepository<Customer, Integer>{

}
