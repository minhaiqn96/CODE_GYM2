package controller;

import model.Customer;
import service.ApplicationRunningInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static model.CustomerManager.addNewCustomer;

public class Main5 implements ApplicationRunningInterface {
    static List<Customer> customerList = new ArrayList<Customer>();
    Customer customer = new Customer();

    public static void main(String[] args) {
        Main5 main5 = new Main5();
        main5.run();
    }

    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        for (; ; ) {
            System.out.println("Menu");
            System.out.println("1. Add new Customers");
            System.out.println("2. Display Information Customer");
            System.out.println("3. Edit Information Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");

            do {
                System.out.println("Choose request: ");
                choiceNumber = scanner.nextInt();
                switch (choiceNumber) {
                    case 1:
                        addListCustomer();
                        break;
                    case 2:
                        listCustomer();
                        break;
                    case 3:
                        editCustomer();
                    case 4:
                        deleteCustomerInList();
                    case 5:
                        exit();

                }
            } while ((choiceNumber < 1) || (choiceNumber > 5));
            break;
        }
    }

    public static void addListCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number customer you want add in list: ");
        int numberCustomer = scanner.nextInt();

        System.out.println("Enter  customer information");


        for (int i = 0; i < numberCustomer; i++) {
            System.out.println("Enter customer information  " + (i + 1) + ":");

            customerList.add(addNewCustomer());

            System.out.println("List customer: ");

        }
        System.out.println(customerList.toString());
        displayMainMenu();
    }

    public static void listCustomer() {
        System.out.println(customerList.toString());
        displayMainMenu();
    }

    private static void editCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edit info, please enter email");
        String resultSearch = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getEmail().equals(resultSearch)) {
                System.out.println(customer.getEmail() + customerList.toString());
                int choiceNumber;
                do {
                    System.out.println(" -------------------------------");
                    System.out.println("| Do you choose edit customer? ");
                    System.out.println("| 1. fullName");
                    System.out.println("| 2. birthday ");
                    System.out.println("| 3. CMND ");
                    System.out.println("| 4. phone number ");
                    System.out.println("| 5. email  ");
                    System.out.println("| 6. type Customer");
                    System.out.println("| 7. Address ");
                    System.out.println("| 8. service type");
                    System.out.println("| 9. total date rent");
                    System.out.println("| 10. room type ");
                    System.out.println("| 11. exit");
                    System.out.println(" -------------------------------");
                    choiceNumber = scanner.nextInt();
                } while (choiceNumber <1 || choiceNumber > 11);
                switch (choiceNumber) {
                    case 1:
                        System.out.println("edit Full Name :");
                        scanner.nextLine();
                        customer.setFullName(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 2:
                        System.out.println("edit birthaday :");
                        customer.setDayOfBirth(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 3:
                        System.out.println("edit CMND :");
                        customer.setCMND(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 4:
                        System.out.println("edit phone number :");
                        customer.setPhoneNumber(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 5:
                        System.out.println("edit email:");
                        customer.setEmail(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 6:
                        System.out.println("edit address :");
                        customer.setAddress(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 7:
                        System.out.println("edit type Customer  :");
                        customer.setGuestType(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 8:
                        System.out.println("edit service type  :");
                        customer.setServiceType(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;
                    case 9:
                        System.out.println("edit total date rent  :");
                        customer.setTotalDateRent(scanner.nextInt());
                        System.out.println(customerList.toString());
                        break;
                    case 10:

                        System.out.println("edit room type  :");
                        customer.setRomeType(scanner.nextLine());
                        System.out.println(customerList.toString());
                        break;

                    case 11:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Email ");
                        break;
                }
            } else {
                System.out.println("Devoid email in list.Enter email difrence, please");
            }
        }
        displayMainMenu();
    }

    public static void deleteCustomerInList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("delete info, please enter email");
        String resultSearch = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getEmail().equals(resultSearch)) {
                customerList.remove(customer);
                System.out.println(customerList);


            }
        }
    }

    public static void exit() {
    }

    @Override
    public void run() {
        displayMainMenu();
        addListCustomer();
        editCustomer();
        listCustomer();
        deleteCustomerInList();
        exit();
    }
}