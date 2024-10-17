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
            System.out.println("ADD: You added a contact! " + contact.phoneNumber);
        }
        else{
            System.out.println("ADD: Phone number is short " + contact.phoneNumber);
        }
    }

    public void removeContact(String name){
        boolean isFound = false;
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).name.equals(name)){
                contacts.remove(i);
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("REMOVE: "+name +" successfully removed");
        }
        else{
            System.out.println("REMOVE: "+name + " removal failed");
        }
    }

    public void findByName(String name) {
        Contact contact = null;
        for(Contact i: contacts){
            if(i.name.equals(name)){
                contact = i;
                break;
            }
        }
        if(contact!=null){
            System.out.println("FIND: "+contact.name + " is found in the app");
        }
        else{
            System.out.println("FIND: "+name+" is not found");
        }
    }

    public void updateName(String oldName, String newName){
        boolean isFound = false;
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).name.equals(oldName)){
                contacts.get(i).name = newName;
                isFound = true;
                break;
            }
        }
        if(isFound){
            System.out.println("UPDATE: " + oldName + " was updated to " + newName);
        }
        else{
            System.out.println("UPDATE: " + oldName + " is not found!");
        }


    }




}
