package com.example.restapi.rest.crudDemo.business;

public class User {

    private String name;

    private String age;

    private String address;

    private String dob;

    private String email;

    private String mobNo;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public User setAge(String age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDob() {
        return dob;
    }

    public User setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobNo() {
        return mobNo;
    }

    public User setMobNo(String mobNo) {
        this.mobNo = mobNo;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age='" + age + '\'' +
               ", address='" + address + '\'' +
               ", dob='" + dob + '\'' +
               ", email='" + email + '\'' +
               ", mobNo='" + mobNo + '\'' +
               '}';
    }
}
