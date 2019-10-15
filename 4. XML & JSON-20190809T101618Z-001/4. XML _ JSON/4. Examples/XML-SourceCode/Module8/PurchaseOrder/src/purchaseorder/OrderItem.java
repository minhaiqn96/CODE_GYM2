/*
 * OrderItem.java
 *
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
public class OrderItem {
  
  // stores the product code
  public String prodCode  = "";
  
  //stores the product name
  public String prodName  = "";
  
  //stores the description of the product
  public String desc = "";
  
  //stores the quantity
  public int qty = 0;
  
  //stores the price of the product
  public double price  = 0.0;
  
  /** Creates a new instance of OrderItem */
  public OrderItem() {
  }
  
  public void displayItems() {
    System.out.println( "Items Ordered: " );
    System.out.println( "  Product Code - "   + prodCode  );
    System.out.println( "  Product Name - "   + prodName  );
    System.out.println( "  Description - " + desc );
    System.out.println( "  Quantity - "  + Integer.toString(qty) );
    System.out.println( "  Cost - " + Double.toString(price ));
  }
  
}

  