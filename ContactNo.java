package com.javaproject.phonebook;

import java.util.ArrayList;
import java.util.List;

//contact & name
public class ContactNo {
    private String name;
    private List<String> phoneNumbers;

    //initialize contact & name
    public ContactNo(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    //add contact no.
    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public String toString() {
        String result = name + " : ";
        for (int i = 0; i < phoneNumbers.size(); i++) {
            //this check if i is not 0 means it's not a first contact number then it should be separated by ",".
            if (i != 0) {
                result += ", ";
            }
            result += phoneNumbers.get(i);
        }
        return result;
    }
}






