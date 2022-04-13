package com.mchindwhite;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //method
    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
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
