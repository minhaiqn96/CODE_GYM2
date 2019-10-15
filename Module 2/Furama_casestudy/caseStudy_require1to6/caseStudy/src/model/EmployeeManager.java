package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class EmployeeManager {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployee() {
        return employeeList;
    }

    public void setEmployee(Employee employee) {

    }

    public static Employee addEmployee () {
        Scanner scanner = new Scanner ( System.in );
        Employee employee = new Employee();

        System.out.println ( "Enter fullName:" );
        employee.setFullName ( scanner.nextLine () );

        boolean valid;
        do {
            String x;
            valid = false;
            System.out.println ( "Enter birthday:dd/mm/yyyy" );
            try {
                employee.setDayOfBirth ( scanner.nextLine () );
                valid = true;
                if (!CustomerValidator.checkDayOfBirth ( employee.getDayOfBirth () )) {
                    System.out.println ( "The system has encountered an unexpected problem!!!" );
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine ();
                System.out.println ( "The system has encountered an unexpected problem!!!" );
            }
        } while (!valid);

        do {
            String x;
            valid = false;
            System.out.println ( "Enter CMND:" );
            try {
                employee.setCMND ( scanner.nextLine () );
                valid = true;
                if (!CustomerValidator.checkCMND ( employee.getCMND () )) {
                    System.out.println ( "The system has encountered an unexpected problem!!!" );
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine ();
                System.out.println ( "The system has encountered an unexpected problem!!!" );
            }

        } while (!valid);
        //nhap email
        do {
            String x;
            valid = false;
            System.out.println ( "Enter Email:" );
            try {
                employee.setEmail ( scanner.nextLine () );
                valid = true;
                if (!CustomerValidator.checkEmail ( employee.getEmail () )) {
                    System.out.println ( "The system has encountered an unexpected problem!!!" );
                    valid = false;
                }
            } catch (Exception ex) {
                scanner.nextLine ();
                System.out.println ( "The system has encountered an unexpected problem!!!" );
            }
        } while (!valid);

        System.out.println ( "Enter phone number:" );
        employee.setPhoneNumber ( scanner.nextLine () );

        System.out.println("Enter  Address");
        employee.setAddress(scanner.nextLine());


        System.out.println("Enter  Degree");
        employee.setDegree(scanner.nextLine());

        System.out.println("Enter  Department");
        employee.setDepartmen(scanner.nextLine());

        System.out.println("Enter  Position: sale or marketing or manager");
        employee.setPosition(scanner.nextLine());

        System.out.println("Enter  salary");

        employee.setSalary(scanner.nextFloat());


        System.out.println ( employee.toString() );
        return employee;

    }


}
