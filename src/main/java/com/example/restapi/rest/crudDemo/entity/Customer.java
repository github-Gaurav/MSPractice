package com.example.restapi.rest.crudDemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Payments")
public class Customer {

    private String bankName;
    private String ifscCode;
    private String customerName;
    private String refId;
    private double amount;

    public Customer(String bankName,String ifscCode,String customerName,String refId,double amount){
        this.bankName=bankName;
        this.ifscCode=ifscCode;
        this.customerName=customerName;
        this.refId=refId;
        this.amount=amount;
    }

    public String getBankName() {
        return bankName;
    }

    public Customer setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public Customer setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public double getAmount() {
        return amount;
    }

    public Customer setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
