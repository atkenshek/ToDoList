package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList implements IToDoList {
    public ToDoList() {}

    List<String> currentList = new ArrayList<>();
    public int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit the program");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println();
        System.out.print("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public void showList() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");

    }
    public void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        showList();
    }

    public void removeItem() {
        System.out.println("Remove Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove?");
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
        }else {
            currentList.remove(index-1);
        }
        System.out.println("----------------------");
        showList();


    }
}
