package com.example.restapi.rest.crudDemo.DTO;

import com.example.restapi.rest.crudDemo.entity.Customer;

public class CustomerDTO {

    private String bankName;
    private String ifscCode;
    private String customerName;
    private String refId;
    private double amount;

    public CustomerDTO(String bankName,String ifscCode,String customerName,String refId, double amount){
        this.bankName=bankName;
        this.ifscCode=ifscCode;
        this.customerName=customerName;
        this.refId=refId;
        this.amount=amount;
    }

    public String getBankName() {
        return bankName;
    }

    public CustomerDTO setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public CustomerDTO setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public CustomerDTO setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getRefId() {
        return refId;
    }

    public CustomerDTO setRefId(String refId) {
        this.refId = refId;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public CustomerDTO setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
