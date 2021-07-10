package com.example.restapi.rest.crudDemo.mapper;

import com.example.restapi.rest.crudDemo.DTO.UserDTO;
import com.example.restapi.rest.crudDemo.entity.User;

public class UserMapper {

    public static UserDTO map(User user) {
        System.out.println("Inside Mapper UserDTO1 "+ user);
        return (user == null ? null :
                new UserDTO(user.getAddress(), user.getAge(), user.getDob(), user.getEmail(), user.getMobNo(), user.getName()));
    }

    public static User map(UserDTO user) {
        System.out.println("Inside Mapper User");
        return (user == null ? null :
                new User(user.getAddress(), user.getAge(), user.getDob(), user.getEmail(), user.getMobNo(), user.getName()));
    }

}
