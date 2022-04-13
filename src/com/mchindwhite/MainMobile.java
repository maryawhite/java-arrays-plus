package com.mchindwhite;

import java.util.Scanner;

public class MainMobile {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("404 641 8784");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {                //checking for true false
            System.out.println("New contact added: " + name + " phone " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter name to search for: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found. ");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter name to search for: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found. ");
            return;
        }
        if(mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }


    private static void queryContact(){
        System.out.println("Enter name to search for: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found. ");
            return;
        }
        System.out.println("Name; " + existingContact.getName() + " phone number: " + existingContact.getPhoneNumber());


    }


    private static void startPhone(){
        System.out.println("starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - to query if a contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("choose your action: ");
    }


}
