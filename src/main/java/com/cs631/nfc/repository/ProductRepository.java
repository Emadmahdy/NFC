package com.cs631.nfc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<String, Integer>{

	@Query("select p from Product p where p.name like %:name%")
	public List searchByName(@Param("name") String name);
}
