package com.example.restapi.rest.crudDemo.repository;

import com.example.restapi.rest.crudDemo.entity.Customer;
import com.example.restapi.rest.crudDemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByRefId(String refId);

}
