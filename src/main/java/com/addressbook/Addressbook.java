package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressbook {
    private static final ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    static Scanner sc = new Scanner(System.in);


        public static void main(String[] args) {
            System.out.println("Welcome to Address Book System");

            }

    public ArrayList<Contacts> addContacts(Contacts contact) {
            contacts.add(contact);

        return contacts;
    }
}


