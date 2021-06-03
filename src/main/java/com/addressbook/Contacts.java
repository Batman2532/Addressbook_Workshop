package com.addressbook;

public class Contacts {
    public  String firstName;
    public  String lastName;
    public  String address;
    public  String city;
    public  String state;
    public  int zipCode;
    public  int phoneNumber;
    public  String email;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zipCode, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
