package com.cs631.nfc.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cs631.nfc.beans.Orders;

@Repository
public interface CustomerOrderRepository extends CrudRepository<Orders, Integer> {

	
	@Query(value = "SELECT * FROM orders o where o.cid = :cid", nativeQuery = true)
	public Orders[] searchByCustomerId(@Param("cid") int cid);

	@Query(value = "select * from orders where processed = false", nativeQuery = true)
	public Orders[] searchUnprocessed();

	@Modifying
	@Transactional
	@Query(value = "update  orders set processed = true where oid = :oid", nativeQuery = true)
	public int markProcessed(@Param("oid") int oid);

	
}
