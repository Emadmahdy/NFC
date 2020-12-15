package com.cs631.nfc.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cs631.nfc.beans.EmployeeAddRole;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeAddRole, Integer> {

	
	@Query(value = "select * from employee e, address a, role r\r\n" + 
			"where e.role = r.rid\r\n" + 
			"and e.addid = a.aid\r\n" + 
			"and e.eid = :eid", nativeQuery = true)
	public EmployeeAddRole searchByEmployeeId(@Param("eid") int eid);

}
