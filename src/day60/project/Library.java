package day60.project;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println(item.getTitle() + " was added to the library!");
    }

    public void updateItem(int id, String title, int year){
        boolean isFound = false;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getId() == id){
                isFound = true;
                items.get(i).setTitle(title);
                items.get(i).setYear(year);
                System.out.println("Item with id: " + id + " is updated!");
                break;
            }
        }

        if(!isFound){
            System.out.println("Failed to update item with id: " + id);
        }
    }

    public void deleteItem(int id){
        boolean isFound = false;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getId() == id){
                isFound = true;
                items.remove(i);
                System.out.println("Item with id: " + id + " is removed!");
                break;
            }
        }

        if(!isFound){
            System.out.println("Failed to find item with id: " + id);
        }
    }

    public void findItem(int id){
        boolean isFound = false;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getId() == id){
                isFound = true;
                System.out.println(items.get(i));
                break;
            }
        }

        if(!isFound){
            System.out.println("Failed to find item with id: " + id);
        }
    }
}
