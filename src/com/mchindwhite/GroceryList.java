package com.mchindwhite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //method to add an item
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    //get list
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //method to print the list
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " " + groceryList.get(i));
        }
    }

    //modify list, using an overloaded method and calling the other modifyGroceryItem
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //method to modify list
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    //method to delete list item
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    //method to delete list item
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //query
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }

}
//size method--the number of elements in the list
//get method--get's the index
//contains-returns true or false
//indexOf -- returns the index of the item, or -1 if it doesn't exist
//set method--replaces the item at the index
//remove method--removes the item at the index
