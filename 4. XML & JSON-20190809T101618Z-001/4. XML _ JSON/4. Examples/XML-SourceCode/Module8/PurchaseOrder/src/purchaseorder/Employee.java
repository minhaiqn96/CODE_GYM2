/*
 * Employee.java
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package purchaseorder;

import java.io.*;
/**
 *
 * @author vincent
 */
public class Employee {
  
  // stores employee name
  public String fName = "";
  
  //stores employees department name
  public String department  = "";
  
  //stores employees id
  public String empId  = "";
  
  //stores employees designation
  public String designation = "";
  
  /** Creates a new instance of Employee */
  public Employee() {
  }
  
  /** displays the details of employee */
  public void displayEmployee() {
    System.out.println( "Employee Details: " );
    System.out.println( "  Name - "  + fName);
    System.out.println( "  Employee Id - " + empId);
    System.out.println( "  Department - "   + department);
    System.out.println( "  Designation - "   + designation);
  }
}

