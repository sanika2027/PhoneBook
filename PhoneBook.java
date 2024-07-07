package com.javaproject.phonebook;

import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, ContactNo> contacts;

    PhoneBook(){
        contacts = new HashMap<>();
    }

    //can add multiple contact number
    public void addContact(String name, String... numbers){
        ContactNo contact = new ContactNo(name);//create object to add contact.
        for(String number: numbers){
            contact.addPhoneNumber(number);
        }
        //add contact to map
        contacts.put(name, contact);
    }

    //add existing contact no
    public void addContact(ContactNo contact){
        contacts.put(contact.getName(), contact);
    }

    //print all contact number
    public void displayContact(){
        int count = 1;
        for (ContactNo contact : contacts.values()) {//it gives all values of map
            System.out.println(count + ") " + contact);
            count++;
        }
    }

    public int getSize() {
        return contacts.size();
    }

    //check existing name
    public boolean isContact(String name){
        return contacts.containsKey(name);
    }
}
