package com.mchindwhite;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    //constructor, and initialize arrayList
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }


    //add a contact, remember to check to see if contact already exists
    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    //create the findContact methods, overloaded one to find the index and one to check the name
    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {   //using the getter from the contacts class
                return i;
            }
        }
        return -1;
    }

    //modify contact
    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);  //use the findContact method that we already defined to get the index
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update not successful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    //query contacts
//    public String queryContact(Contacts contact) {
//        if(findContact(contact) >= 0) {
//            return contact.getName();
//        }
//        return null;
//    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    //remove contact
    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);  //use the findContact method that we already defined to get the index
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    //print contacts method for the MainMobile class
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " --> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}


/*create a program that implements a simple mobile phone with the following capabilities:
able to store, modify, remove and query contact names
create a separate class for Contacts (name and phone number)
create a master class (Mobile Phone) that holds the arrayList of Contacts
The MobilePhone class has the functionality listed above
Add a menu of options that are available
Options: quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact
When adding or updating be sure to check if the contact already exists (use name)
Don't expose the inner workings of the ArrayList to MobilePhone. e.g. no ints, no .get(i), etc
MobilePhone should do everything with Contact objects only
*
*
* */
