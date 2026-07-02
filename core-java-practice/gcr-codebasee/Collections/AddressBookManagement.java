/*

Build an Address Book Management System that stores contact details such as name, phone number, and email address. Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention. Your program should support the following functionalities: I Store all contacts in an ArrayList to maintain an ordered list. Use a HashMap<String, Contact> for quick lookup of contacts by name. Use a HashSet String> to ensure that duplicate phone numbers cannot be added. Implement functionality to add, search, delete, and display contacts. Display all contacts sorted alphabetically by name using Collections.sort(). Ensure that whenever a contact is added or deleted, all three collections remain synchronized and contain consistent data.


*/


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
    class AddressBookManagement{
      //why use static here?
      //Using static here allows the collections to be shared across all instances of the AddressBookManagement class, ensuring that the contact data remains consistent and synchronized regardless of how many instances of the class are created. This is important for maintaining a single source of truth for the contact information, as all instances will operate on the same collections.
      static ArrayList<Contact> list = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }
        Contact contact = new Contact(name, phone, email);
        //explain works of add,put
        // list.add(contact): Adds the contact to the ArrayList, maintaining the order of insertion.
        // map.put(name, contact): Adds the contact to the HashMap with the name as the key for quick lookup.
        // phones.add(phone): Adds the phone number to the HashSet, ensuring no duplicates.


        list.add(contact);
        map.put(name, contact);
        phones.add(phone);
        System.out.println("Contact added successfully.");
    }
    static void searchContact(String name) {
        if (map.containsKey(name)) {
            Contact contact = map.get(name);
            System.out.println("Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email);
        } else {
            System.out.println("Contact not found.");
        }
    }
    static void deleteContact(String name) {
        if (map.containsKey(name)) {
            Contact contact = map.get(name);
            list.remove(contact);
            map.remove(name);
            phones.remove(contact.phone);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
  }}