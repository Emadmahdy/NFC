package com.cs631.nfc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cs631.nfc.beans.Orders;

@Repository
public interface CustomerOrderRepository extends CrudRepository<Orders, Integer> {

	
	@Query(value = "SELECT * FROM orders o where o.cid = :cid", nativeQuery = true)
	public Orders[] searchByCustomerId(@Param("cid") int cid);

}
