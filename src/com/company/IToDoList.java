package com.company;
import java.util.Scanner;

public interface IToDoList {

    Scanner scanner = new Scanner(System.in);
    static void showList(){}
    static void addItem(){}
    static void removeItem(){}
    static int menu() {
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
        return scanner.nextInt();
    }
}
