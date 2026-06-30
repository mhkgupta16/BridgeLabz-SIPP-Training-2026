
/*1. An address book app stores contacts (name, phone, email). Use
ArrayList for ordered storage, HashMap for fast name lookup, HashSet to
prevent duplicate phone numbers. Implement: add, search, delete, display
sorted by name using Collections.sort(). */

import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}

public class AddressBookApp {

    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneNumbers = new HashSet<>();

    void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        contactMap.put(name, c);
        phoneNumbers.add(phone);

        System.out.println("Contact added successfully.");
    }

    void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            System.out.println(contactMap.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    void deleteContact(String name) {

        Contact c = contactMap.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneNumbers.remove(c.phone);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nSorted Contacts:");

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        AddressBookApp app = new AddressBookApp();

        app.addContact("Mahak", "9876543210", "mahak@gmail.com");
        app.addContact("Anu", "9876543211", "anu@gmail.com");
        app.addContact("Riya", "9876543212", "riya@gmail.com");

        app.searchContact("Anu");

        app.deleteContact("Riya");

        app.displayContacts();
    }
}