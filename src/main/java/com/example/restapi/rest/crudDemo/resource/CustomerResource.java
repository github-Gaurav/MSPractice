package com.example.restapi.rest.crudDemo.resource;

import com.example.restapi.rest.crudDemo.DTO.CustomerDTO;
import com.example.restapi.rest.crudDemo.DTO.UserDTO;
import com.example.restapi.rest.crudDemo.entity.Customer;
import com.example.restapi.rest.crudDemo.mapper.UserMapper;
import com.example.restapi.rest.crudDemo.service.CustomerService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomerDetails(@RequestBody CustomerDTO customerDTO){
       // Customer customer = new Customer("ICICI", "ICIC1000", "John", 12345, 50000.00);
        // convert to business
        // modify ref while saving
        // business to ENTITY .
        // repository.
        return customerService.addCustomerData(customerDTO);
    }

    @GetMapping("/getCustomer/{id}")
    public void getUserById(@PathVariable String id) {
         customerService.getCustomerData(id);
    }



}
