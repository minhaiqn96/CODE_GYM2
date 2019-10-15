package controller;

import model.Customer;

import service.ApplicationRunningInterface;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes;


import static model.CustomerManager.addNewCustomer;
import static model.CustomerManager.deleteCustomer;

public class Main4 implements ApplicationRunningInterface {
    static List<Customer> customerList = new ArrayList<Customer>();
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        main4.run();
    }

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        for (; ; ) {
            System.out.println("Menu");
            System.out.println("1. Add new Customers");
            System.out.println("2. Delete Customer");

            do {
                System.out.println("Choose request: ");
                choiceNumber = scanner.nextInt();
                switch (choiceNumber) {
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        deleteCustomer();
                        break;

                }
            } while ((choiceNumber < 1) || (choiceNumber > 2));
            break;
        }
    }

    public static void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number customer you want add in list: ");
        int numberCustomer = scanner.nextInt();

        System.out.println("Enter  customer information");


        for (int i = 0; i < numberCustomer; i++) {
            System.out.println("Enter customer information  " + (i + 1) + ":");

            customerList.add(addNewCustomer());

            System.out.println("List customer: ");

        }
        customerList.sort(new NameSorter());
        System.out.println(customerList.toString());
    }

    @Override
    public void run() {
        menu();
        addCustomer();
    }

    static class NameSorter implements Comparator<Customer>
    {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getFullName().compareToIgnoreCase(o1.getFullName());
        }
    }
}
