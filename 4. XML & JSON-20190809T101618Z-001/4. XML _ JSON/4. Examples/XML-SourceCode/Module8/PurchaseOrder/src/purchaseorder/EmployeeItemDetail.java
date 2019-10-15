/*
 * EmployeeItemDetail.java
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package purchaseorder;

/**
 *
 * @author vincent
 */

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;
import java.util.*;

public class EmployeeItemDetail extends DefaultHandler {
  
  // Employee object to collect employee XML data
  private Employee objEmp = new Employee();
  
  // stores the list of items ordered
  private Vector orderItems = new Vector();
  
  // OrderItem object to collect item details
  private OrderItem currentOrderItem;
  
  // Buffer for collecting data from the "characters" SAX event.
  private CharArrayWriter contents = new CharArrayWriter();
  
  /** Creates a new instance of EmployeeItemDetail */
  public EmployeeItemDetail() {
  }
  
  // Override methods of the DefaultHandler class
  // to gain notification of SAX Events.
  // See org.xml.sax.ContentHandler for all available events.
  public void startElement( String namespaceURI, String localName,
      String qName, Attributes attr ) throws SAXException {
    contents.reset();
    if ( localName.equals( "OrderItem" ) ) {
      currentOrderItem = new OrderItem();
      orderItems.addElement( currentOrderItem );
    }
  }
  
  public void endElement( String namespaceURI, String localName,
      String qName ) throws SAXException {
    if ( localName.equals( "Name" ) ) {
      objEmp.fName = contents.toString();
    }
    if ( localName.equals( "Department" ) ) {
      objEmp.department = contents.toString();
    }
    if ( localName.equals( "EmployeeId" ) ) {
      objEmp.empId = contents.toString();
    }
    if ( localName.equals( "Designation" ) ) {
      objEmp.designation = contents.toString();
    }
    if ( localName.equals( "Quantity" ) ) {
      currentOrderItem.qty = Integer.valueOf(contents.toString().trim()).intValue();
    }
    if ( localName.equals( "ProductCode" ) ) {
      currentOrderItem.prodCode = contents.toString();
    }
    if ( localName.equals( "ProductName" ) ) {
      currentOrderItem.prodName = contents.toString();
    }
    
    if ( localName.equals( "Description" ) ) {
      currentOrderItem.desc = contents.toString();
    }
    if ( localName.equals( "Price" ) ) {
      currentOrderItem.price = Double.valueOf(contents.toString().trim()).doubleValue();
    }
  }
  
  public void characters( char[] ch, int start, int length )
  throws SAXException {
    contents.write( ch, start, length );
  }
  
  public Employee getCustomer()  {
    return objEmp;
  }
  
  public Vector getOrderItems() {
    return orderItems;
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main( String[] argv ){
    System.out.println( "SAX EXample:" );
    try {
      
      // Create SAX 2 parser
      XMLReader xr = XMLReaderFactory.createXMLReader();
      
      // Creates an object of the class
      EmployeeItemDetail saxObj = new EmployeeItemDetail();
      
      // Sets the ContentHandler
      xr.setContentHandler( saxObj );
      
      //Obtains the user directory
      String path = System.getProperty("user.dir");
      
      //Appends the xml file to the users directory
      String filename = new String(path+"\\Purchase.xml");
      try {
        
        //Parses the document
        xr.parse(new InputSource(filename));
        
        //Obtains the details of Employee class
        Employee objEmp = saxObj.getCustomer();
        objEmp.displayEmployee();
        
        // Display all order items to stdout
        OrderItem ordObj;
        Vector items = saxObj.getOrderItems();
        Enumeration e = items.elements();
        while( e.hasMoreElements()){
          ordObj = (OrderItem) e.nextElement();
          ordObj.displayItems( );
        }
        
      } catch (IOException ex) {
        ex.printStackTrace();
      } catch (SAXException ex) {
        ex.printStackTrace();
      }
    } catch (SAXException ex) {
      ex.printStackTrace();
    }
  }
}
