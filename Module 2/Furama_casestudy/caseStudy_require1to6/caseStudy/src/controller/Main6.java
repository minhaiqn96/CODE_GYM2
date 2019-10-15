package controller;

import model.Customer;
import model.Employee;
import service.ApplicationRunningInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.Main5.exit;

import static model.EmployeeManager.addEmployee;

public class Main6 implements ApplicationRunningInterface {
    static List<Employee> employeeList = new ArrayList<Employee>();
    Employee employee = new Employee();

    public static void main(String[] args){
        Main6 main6 = new Main6();
        main6.run();

    }

    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        for (; ; ) {
            System.out.println("Menu");
            System.out.println("1. Add new Employees");
            System.out.println("2. Display Information Employee");
            System.out.println("3. Edit Information Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            do {
                System.out.println("Choose request: ");
                choiceNumber = scanner.nextInt();
                switch (choiceNumber) {
                    case 1:
                        addListEmployee();
                        break;
                    case 2:
                        listEmployee();
                        break;
                    case 3:
                        editEmployee();
                    case 4:
                        deleteEmployeeInList();
                    case 5:
                        exit();

                }
            } while ((choiceNumber < 1) || (choiceNumber > 5));
            break;
        }
    }

    public static void addListEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number employee you want add in list: ");
        int numberCustomer = scanner.nextInt();

        System.out.println("Enter  employee information");


        for (int i = 0; i < numberCustomer; i++) {
            System.out.println("Enter employee information  " + (i + 1) + ":");

           employeeList.add(addEmployee());

            System.out.println("List customer: ");

        }
        System.out.println(employeeList.toString());
        displayMainMenu();
    }

    public static void listEmployee() {
        System.out.println(employeeList.toString());
        displayMainMenu();
    }

    private static void editEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Edit info, please enter email");
        String resultSearch = scanner.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getEmail().equals(resultSearch)) {
                System.out.println(employee.getEmail() + employeeList.toString());
                int choiceNumber;
                do {
                    System.out.println(" -------------------------------");
                    System.out.println("| Do you choose edit customer? ");
                    System.out.println("| 1. fullName");
                    System.out.println("| 2. birthday ");
                    System.out.println("| 3. CMND ");
                    System.out.println("| 4. phone number ");
                    System.out.println("| 5. email  ");
                    System.out.println("| 6. salary");
                    System.out.println("| 7. Address ");
                    System.out.println("| 8. departmen");
                    System.out.println("| 9. position");
                    System.out.println("| 10. degree ");
                    System.out.println("| 11. exit");
                    System.out.println(" -------------------------------");
                    choiceNumber = scanner.nextInt();
                } while (choiceNumber > 11);
                switch (choiceNumber) {
                    case 1:
                        System.out.println("edit Full Name :");
                        scanner.nextLine();
                        employee.setFullName(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 2:
                        System.out.println("edit birthaday :");
                        employee.setDayOfBirth(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 3:
                        System.out.println("edit CMND :");
                        employee.setCMND(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 4:
                        System.out.println("edit phone number :");
                        employee.setPhoneNumber(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 5:
                        System.out.println("edit email:");
                        employee.setEmail(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 6:
                        System.out.println("edit address :");
                        employee.setAddress(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 7:
                        System.out.println("edit Departmen :");
                        employee.setDepartmen(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 8:
                        System.out.println("edit Degree  :");
                        employee.setDegree(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 9:
                        System.out.println("edit Position :");
                        employee.setPosition(scanner.nextLine());
                        System.out.println(employeeList.toString());
                        break;
                    case 10:

                        System.out.println("edit salary :");
                        employee.setSalary(scanner.nextFloat());
                        System.out.println(employeeList.toString());
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
    public static void deleteEmployeeInList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("delete info, please enter email");
        String resultSearch = scanner.nextLine();
        for (Employee employee
                : employeeList) {
            if (employee.getEmail().equals(resultSearch)) {
                employeeList.remove(employee);
                System.out.println(employeeList);


            }
        }
    }
    @Override
    public void run() {
        displayMainMenu();
        addEmployee();
        editEmployee();
    }
}
