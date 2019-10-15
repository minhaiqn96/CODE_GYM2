package controller;


import model.Customer;
import service.ApplicationRunningInterface;

import java.util.Scanner;


public class Main2 implements ApplicationRunningInterface {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.run();
    }
//
//    public static void menu() {
//        CustomerManager customerManager = new CustomerManager();
//        Scanner scanner = new Scanner(System.in);
//        int choiceNumber;
//        for (; ; ) {
//            System.out.println("Menu");
//            System.out.println("1. Add new Customer");
//            System.out.println("2. Edit Customers");
//            System.out.println("3. delete Customer");
//            System.out.println("4. Exit");
//            do {
//                System.out.println("Choose reques: ");
//                choiceNumber = scanner.nextInt();
//                switch (choiceNumber) {
//                    case 1:
//                        addNewCustomer();
//                        break;
//                    case 2:
//                        editInfoCustomer();
//                        break;
//                    case 3:
//                        addNewCustomer();
//                        break;
//                }
//            } while ((choiceNumber < 1) || (choiceNumber > 3));
//            break;
//        }
//    }

//    public static Customer editInfoCustomer() {
//        Customer customer1 = new Customer
//                ("diem", "14/01/1996", "205900331", "09887654323", "diembate@gmail.com", "Vip", "Quang Nam");
//
//
//        System.out.println("Edit info, please enter email");
//        Scanner scanner = new Scanner(System.in);
//        String resultSearch = scanner.nextLine();
//        if (customer1.=========ail().equals(resultSearch)) {











//            System.out.println(customer1.toString());
//        } else {
//            System.out.println("email không đúng");
//        }
//
//        System.out.println("choose info you want edit");

//        CustomerManager customerManager = new CustomerManager();
//        Scanner scanner2 = new Scanner(System.in);
//        int choiceNumber;
//        for (; ; ) {
//
//            System.out.println("1. edit full name");
//            System.out.println("2. Edit birthđay");
//            System.out.println("3. edit phone number");
//            System.out.println("4. Exit");
//            do {
//                System.out.println("Choose reques: ");
//                choiceNumber = scanner2.nextInt();
//                switch (choiceNumber) {
//                    case 1:
//                        customer1.getAddress();
//                        break;
//                    case 2:
//                        customer1.getPhoneNumber();
//                        break;
//                    case 3:
//                        customer1.getAddress();
//                        break;
//
//                }
//                while ((choiceNumber < 1) || (choiceNumber > 3))
//
public static void editInfoCustomer() {
    Scanner scanner = new Scanner(System.in);
    Customer customer01 = new Customer
              ("diem", "14/01/1996", "205900331", "09887654323", "diembate@gmail.com", "Vip", "Quang Nam",6,"tct",7,"en");
  System.out.println("Edit info, please enter email");
    String resultSearch = scanner.nextLine();

    if (customer01.getEmail().equals(resultSearch)) {
        System.out.println(customer01.getEmail() + customer01.toString());
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
        } while (choiceNumber>11);
        switch (choiceNumber){
            case 1:
                System.out.println("edit Full Name :");
                scanner.nextLine();
                customer01.setFullName(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 2:
                System.out.println("edit birthaday :");
                customer01.setDayOfBirth(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 3:
                System.out.println("edit CMND :");
                customer01.setCMND(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 4:
                System.out.println("edit phone number :");
                customer01.setPhoneNumber(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 5:
                System.out.println("edit email:");
                customer01.setEmail(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 6:
                System.out.println("edit address :");
                customer01.setAddress(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 7:
                System.out.println("edit type Customer  :");
                customer01.setGuestType(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 8:
                System.out.println("edit service type  :");
                customer01.setServiceType(scanner.nextLine());
                System.out.println(customer01.toString());
                break;
            case 9:
                System.out.println("edit total date rent  :");
                customer01.setTotalDateRent(scanner.nextInt());
                System.out.println(customer01.toString());
                break;
            case 10:

                System.out.println("edit room type  :");
                customer01.setRomeType(scanner.nextLine());
                System.out.println(customer01.toString());
                break;

            case 11:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Email ");
                break;
        }
    }else{
        System.out.println("Devoid email in list.Enter email difrence, please");
    }
}


        @Override
        public void run () {

            editInfoCustomer();

        }
    }