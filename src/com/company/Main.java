package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = IToDoList.menu();
            switch (menuItem) {
                case 1:
                    ToDoList.showList();
                    break;
                case 2:
                    ToDoList.addItem();
                    break;
                case 3:
                    ToDoList.removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }

    }

}

