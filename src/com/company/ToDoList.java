package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList implements IToDoList {
    static List<String> currentList = new ArrayList<String>();
    public static void showList() {
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
    public static void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        showList();
    }

    public static void removeItem() {
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
