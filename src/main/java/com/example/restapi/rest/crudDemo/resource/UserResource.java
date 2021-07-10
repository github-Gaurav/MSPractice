package com.example.restapi.rest.crudDemo.resource;

import com.example.restapi.rest.crudDemo.DTO.UserDTO;
import com.example.restapi.rest.crudDemo.entity.User;
import com.example.restapi.rest.crudDemo.mapper.UserMapper;
import com.example.restapi.rest.crudDemo.service.UserService;
import io.reactivex.Single;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class UserResource {

    Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Single<ResponseEntity<UserDTO>> addUser(@RequestBody UserDTO userDTO) {
        System.out.println("inside addUser controller package");
        return Single.just(userDTO)
                     .map(UserMapper::map)
                     .flatMap(u -> userService.addUser(u))
                     .map(UserMapper::map)
                     .map(p -> new ResponseEntity<UserDTO>(p, HttpStatus.CREATED));

    }

    @GetMapping("/get/{id}")
    public Single<ResponseEntity<UserDTO>> getUserById(@PathVariable String id) {
        System.out.println("Inside getUserById method");
        return Single.just(id).flatMap(u -> userService.getById(u))
                     .doOnSuccess(t -> LOGGER.debug("The received data is {}", t))
                     .map(UserMapper::map).map(p -> new ResponseEntity<UserDTO>(p, HttpStatus.OK));
    }

    @GetMapping("/name/{name}")
    public Single<ResponseEntity<UserDTO>> getUserByName(@PathVariable String name) {
		
	/* return Single.just(userService.getByUserName(name))
			 .map(UserMapper::map)
			 .map(p-> new ResponseEntity<UserDTO>(p, HttpStatus.OK));
	 
	// Single.just(name).flatMap(u->userService.getByUserName(u))
		*/
        System.out.print("testing");
        return null;
    }

    @GetMapping("/getDetails")
    public Single<ResponseEntity<List<UserDTO>>> getAll() {
        return null;

    }

    @PostMapping("/addData")
    public Single<User> addDetails(){
        User user = new User("98845","Gaurav", "31", "noida", "08", "asasas");
        user.setName("Ankush_1");
        return userService.addUser(user);

    }

}
