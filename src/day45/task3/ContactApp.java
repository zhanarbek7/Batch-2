package day45.task3;

import java.util.ArrayList;

public class ContactApp {
    ArrayList<Contact> contacts = new ArrayList<>();

    public ContactApp(){
        System.out.println("You opened Contacts App");
    }

    public void addContact(Contact contact){
        if(contact.phoneNumber.length()>=10) {
            contacts.add(contact);
            System.out.println("You added a contact! " + contact.phoneNumber);
        }
        else{
            System.out.println("Phone number is short " + contact.phoneNumber);
        }
    }

    public void removeContact(String name){
        boolean isFound = false;
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).name.equals(name)){
                contacts.remove(i);
                isFound = true;
            }
        }
        if(isFound){
            System.out.println(name +" successfully removed");
        }
        else{
            System.out.println(name + " removal failed");
        }
    }


}