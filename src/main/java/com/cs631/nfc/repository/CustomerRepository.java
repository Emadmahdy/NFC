package com.cs631.nfc.repository;

import java.sql.Date;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cs631.nfc.beans.Address;
import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerAdd, Integer> {

	public static final EntityManager entityManager = null;
	
	@Query(value = "select * from customer c, address a where c.addid = a.aid and c.cid= :cid", nativeQuery = true)
	public Optional<CustomerAdd> searchById(@Param("cid") int cid);

	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value =
	 * "INSERT INTO address (`add1`, `add2`, `city`, `state`, `zip`) VALUES \r\n" +
	 * "(:add1, :add2, :city, :state, :zip)", nativeQuery = true) public Address
	 * saveAddress(@Param("add1") String add1, @Param("add2") String
	 * add2, @Param("city") String city,
	 * 
	 * @Param("state") String state, @Param("zip") int zip);
	 * 
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value =
	 * "INSERT INTO customer (`firstname`, `lastname`, `addid`, `username`, `password`, `dob`)\r\n"
	 * + "VALUES (:firstname, :lastname, :addid, :username, :password, :dob)",
	 * nativeQuery = true) public int savecustomer(@Param("firstname") String
	 * firstname, @Param("lastname") String lastname,
	 * 
	 * @Param("dob") Date dob, @Param("username") String
	 * username, @Param("password") String password,
	 * 
	 * @Param("addid") int getaddid);
	 * 
	 */

}
