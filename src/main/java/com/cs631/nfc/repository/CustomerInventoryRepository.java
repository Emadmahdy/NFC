package com.cs631.nfc.repository;

import java.sql.Date;
import java.util.List;
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
//import com.cs631.nfc.beans.CustomerAddInv;
import com.cs631.nfc.beans.Inventory;

@Repository
public interface CustomerInventoryRepository extends CrudRepository<Inventory, Integer> {

/*
	
	@Query(value = "SELECT `customer`.`cid`,\r\n" + 
			"    `customer`.`firstname`,\r\n" + 
			"    `customer`.`lastname`,\r\n" + 
			"    `customer`.`addid`,\r\n" + 
			"    `customer`.`username`,\r\n" + 
			"    `customer`.`password`,\r\n" + 
			"    `customer`.`dob`,\r\n" + 
			"    `address`.`aid`,\r\n" + 
			"    `address`.`add1`,\r\n" + 
			"    `address`.`add2`,\r\n" + 
			"    `address`.`city`,\r\n" + 
			"    `address`.`state`,\r\n" + 
			"    `address`.`zip`,\r\n" + 
			"    `inventory`.`iid`,\r\n" + 
			"    `inventory`.`name`,\r\n" + 
			"    `inventory`.`amount`,\r\n" + 
			"    `inventory`.`wid`\r\n" + 
			"FROM customer , address , inventory \r\n" + 
			"where customer.addid = address.aid and customer.cid = inventory.cid and customer.cid= 1\r\n" + 
			"\r\n" + 
			"", nativeQuery = true)
	public Optional<CustomerAddInv> searchById(@Param("cid") int cidd);

	
*/
	
	@Query(value = "SELECT * FROM inventory i where i.cid = :cid", nativeQuery = true)
	public Inventory[] searchById(@Param("cid") int cid);

}
