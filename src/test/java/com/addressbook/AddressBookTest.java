package com.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {

    @Test
    public void givenAddressBookData_WhenRetrieved_shouldMatchTheCount(){
        Addressbook addressbook = new Addressbook();
        Contacts contact = new Contacts("sau","char","mbt","ngp","mh",440030,44556677,"charjan44@gmail.com");
        ArrayList<Contacts> contactsList = addressbook.addContacts(contact);
        Assertions.assertEquals("sau",contact.getFirstName());
        Assertions.assertEquals("char",contact.getLastName());
        Assertions.assertEquals("mbt",contact.getAddress());
        Assertions.assertEquals("ngp",contact.getCity());
        Assertions.assertEquals("mh",contact.getState());
        Assertions.assertEquals(440030,contact.getZipCode());
        Assertions.assertEquals(44556677,contact.getPhoneNumber());
        Assertions.assertEquals("charjan44@gmail.com",contact.getEmail());
        Assertions.assertEquals(1,contactsList.size());
        }
}
