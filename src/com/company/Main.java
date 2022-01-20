package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ToDoList toDoList = new ToDoList();
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = toDoList.menu();
            switch (menuItem) {
                case 1:
                    toDoList.showList();
                    break;
                case 2:
                    toDoList.addItem();
                    break;
                case 3:
                    toDoList.removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }

    }

}

