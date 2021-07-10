package com.example.restapi.rest.crudDemo.service;

import com.example.restapi.rest.crudDemo.DAO.UserDAO;
import com.example.restapi.rest.crudDemo.entity.User;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public Single<User> getById(String id) {
        return Single.just(id).map(u -> userDAO.getUserById(u)).flatMap(u -> Single.just(u));

    }

    @Override
    public Single<User> getByUserName(String name) {
        return Single.just(name).map(u -> userDAO.getUserByName(name)).flatMap(u -> Single.just(u));
    }

    @Override
    public Single<List<User>> getAll() {
        return null;

    }

    @Override
    public Single<User> addUser(User user) {
        System.out.println("Inside Add User Service");
        System.out.println("Inside Add User Service");
        return Single.just(userDAO.addUserData(user));

    }

}
