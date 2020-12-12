package com.cs631.nfc.repository;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cs631.nfc.beans.Address;
import com.cs631.nfc.beans.Customer;

@Repository
@Transactional
public class Customerrepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	public int enterAdd(@Param("add1") String add1, @Param("add2") String add2, @Param("city") String city,
			@Param("state") String state, @Param("zip") int zip) {
	Query query = entityManager.createNamedQuery("INSERT INTO address (`add1`, `add2`, `city`, `state`, `zip`) VALUES \\r\\n\"\r\n" + 
			"			+ \"(:add1, :add2, :city, :state, :zip)", Address.class);
	
	BigInteger biid = (BigInteger) query.getSingleResult();
	long id = biid.longValue();
	return (int) id;
	}
}
