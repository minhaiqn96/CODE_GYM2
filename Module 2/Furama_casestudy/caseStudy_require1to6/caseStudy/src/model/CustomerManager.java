package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomer() {
        return customerList;
    }

    public void setCustomer(Customer customer) {

    }

    public static Customer addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Enter fullName:");
        customer.setFullName(scanner.nextLine());

        boolean valid;
        do {
            String x;
            valid = false;
            System.out.println("Enter birthday:dd/mm/yyyy");
            try {
                customer.setDayOfBirth(scanner.nextLine());
                valid = true;
                if (!CustomerValidator.checkDayOfBirth(customer.getDayOfBirth())) {
                    System.out.println("The system has encountered an unexpected problem!!!");
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine();
                System.out.println("The system has encountered an unexpected problem!!!");
            }
        } while (!valid);

        do {
            String x;
            valid = false;
            System.out.println("Enter CMND:");
            try {
                customer.setCMND(scanner.nextLine());
                valid = true;
                if (!CustomerValidator.checkCMND(customer.getCMND())) {
                    System.out.println("The system has encountered an unexpected problem!!!");
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine();
                System.out.println("The system has encountered an unexpected problem!!!");
            }

        } while (!valid);
        //nhap email
        do {
            String x;
            valid = false;
            System.out.println("Enter Email:");
            try {
                customer.setEmail(scanner.nextLine());
                valid = true;
                if (!CustomerValidator.checkEmail(customer.getEmail())) {
                    System.out.println("The system has encountered an unexpected problem!!!");
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine();
                System.out.println("The system has encountered an unexpected problem!!!");
            }
        } while (!valid);

        System.out.println("Enter phone number:");
        customer.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter address:");
        customer.setAddress(scanner.nextLine());

        System.out.println("Enter money sale:");
        customer.setSale(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter guest type:");
        customer.setGuestType(scanner.nextLine());

        System.out.println("Enter Total Date Rent:");
        customer.setTotalDateRent(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter service type: villa or house or room");
        customer.setServiceType(scanner.nextLine());

        System.out.println("Enter type room: Vip, Business,  Normal");
        customer.setRomeType(scanner.nextLine());

        System.out.println(customer.toString());
        return customer;

    }


    public static void deleteCustomer() {
    }

    ;
}
