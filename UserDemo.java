package com.javaproject.phonebook;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Sanika", "9803324738");
        phoneBook.addContact("Divya", "9837726357", "7829938479");
        phoneBook.addContact("Pooja", "9327784373", "3802883749", "78033792748");
        phoneBook.addContact("Anuja", "8273428947");

        System.out.println("Welcome to PhoneBook!");
        System.out.println("In your phoneBook, you have total "+phoneBook.getSize()+ " contacts.");
        System.out.println("Do you want to see them? Yes/No: ");
        String viewContact = scanner.nextLine();

        if(viewContact.equalsIgnoreCase("Yes")){
            phoneBook.displayContact();
        }

        while (true){
            System.out.println("Do you want to add another contact number in your list? Yes/No: ");
            String addMore = scanner.nextLine();

            if(addMore.equalsIgnoreCase("Yes")){
                System.out.println("Enter the person's name you want to add: ");
                String name = scanner.nextLine();

                if (phoneBook.isContact(name)){
                    System.out.println(name + " already exist in the phone book.");
                }else {
                    ContactNo contactNo = new ContactNo(name);

                    System.out.println("How many mobile number you want to add for "+name + " :");
                    int numContacts = Integer.parseInt(scanner.nextLine());

                    for (int i = 1; i <= numContacts; i++){
                        System.out.println("Contact no: "+i+" - ");
                        String number = scanner.nextLine();
                        contactNo.addPhoneNumber(number);
                    }
                    phoneBook.addContact(contactNo);
                    System.out.println("Successfully added.");
                }
            }else {
                break;
            }
        }
        System.out.println("Do you want to see your updated contact list? Yes/No: ");
        String updatedList = scanner.nextLine();

        if(updatedList.equalsIgnoreCase("Yes")){
            phoneBook.displayContact();
        }

        System.out.println("Thank you for using this app! Welcome Back!");
        scanner.close();
    }
}
