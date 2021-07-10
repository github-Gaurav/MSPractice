package com.example.restapi.rest.crudDemo.repository;

import com.example.restapi.rest.crudDemo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);

}
