package com.example.restapi.rest.crudDemo.service;

import com.example.restapi.rest.crudDemo.entity.User;
import io.reactivex.Single;

import java.util.List;

public interface UserService {

    //public Single<User> getById(String id);
    public Single<User> getById(String id);

    public Single<User> getByUserName(String name);

    public Single<List<User>> getAll();

    public Single<User> addUser(User user);



}
