package com.example.restapi.rest.crudDemo.business;

public class Customer {

    private String bankName;
    private String ifscCode;
    private String customerName;
    private String refId;
    private double amount;


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

    public Customer setRefId(String refId) {
        this.refId = refId;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Customer setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
