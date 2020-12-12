package com.cs631.nfc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cs631.nfc.beans.Customer;
import com.cs631.nfc.beans.CustomerAdd;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerAdd, Integer>{

	//EntityManagerFactory emf = new 
	//EntityManager em = new 
	
	
	  @Query(value= "select * from customer c, address a where c.addid = a.aid and c.cid= :cid", nativeQuery = true)
	  public Optional<CustomerAdd> searchById(@Param("cid") int cid);
	 
		/*
		 * public default ResultSet getCutomerById (int id) {
		 * 
		 * 
		 * return null; }
		 */
	 
}
