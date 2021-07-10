package com.example.restapi.rest.crudDemo.service;

import com.example.restapi.rest.crudDemo.DTO.CustomerDTO;
import com.example.restapi.rest.crudDemo.entity.Customer;
import com.example.restapi.rest.crudDemo.mapper.CustomerMapper;
import com.example.restapi.rest.crudDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomerData(CustomerDTO customerDTO){
        CustomerMapper customerMapper = new CustomerMapper();

        //customerMapper.mapBusinesstoEntity(customerMapper.toBusiness(customerDTO));
        return customerRepository.save(customerMapper.mapBusinesstoEntity(customerMapper.toBusiness(customerDTO)));
    }

    public void getCustomerData(String refID){
        Customer customer =  customerRepository.findByRefId(refID);
        System.out.println(customer.getCustomerName());
    }


}
