package com.example.restapi.rest.crudDemo.mapper;

import com.example.restapi.rest.crudDemo.DTO.CustomerDTO;
import com.example.restapi.rest.crudDemo.DTO.UserDTO;
import com.example.restapi.rest.crudDemo.entity.Customer;
import com.example.restapi.rest.crudDemo.entity.User;

public class CustomerMapper {
    public static CustomerDTO map(Customer customer) {
        System.out.println("Inside Mapper UserDTO1 "+ customer);
        return (customer == null ? null :
                new CustomerDTO(customer.getBankName(), customer.getIfscCode(), customer.getCustomerName(), customer.getRefId(), customer.getAmount()));
    }

    public static Customer map(CustomerDTO customer) {

        System.out.println("Inside Mapper User");
        return (customer == null ? null :
                new Customer(customer.getBankName(), customer.getIfscCode(), customer.getCustomerName(), customer.getRefId(), customer.getAmount()));
    }

    public static Customer mapBusinesstoEntity(com.example.restapi.rest.crudDemo.business.Customer customer) {
        return (customer == null ? null :
                new Customer(customer.getBankName(), customer.getIfscCode(), customer.getCustomerName(), customer.getRefId(), customer.getAmount()));
    }


    // conver to business

    public com.example.restapi.rest.crudDemo.business.Customer toBusiness(CustomerDTO customerDTO){
        com.example.restapi.rest.crudDemo.business.Customer customer =new com.example.restapi.rest.crudDemo.business.Customer();
        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setBankName(customerDTO.getBankName());
        customer.setIfscCode(customerDTO.getIfscCode());
        customer.setAmount(customerDTO.getAmount());
        customer.setRefId(customerDTO.getRefId()+"_ID");
        return customer;
    }

}
