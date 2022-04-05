package com.rest.springREST.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rest.springREST.main.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
