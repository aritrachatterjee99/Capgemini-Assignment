package com.rest.springREST.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rest.springREST.main.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
