import customer.Customer;

import java.util.*;

public class Cinema {

    public static Queue<Customer> queueCustomer = new LinkedList<Customer>();

    static {
       queueCustomer.add(Customer.customerArrayList.get(0));
       queueCustomer.add(Customer.customerArrayList.get(1));
       queueCustomer.add(Customer.customerArrayList.get(2));
       queueCustomer.add(Customer.customerArrayList.get(3));
    }
    @Override
    public String toString() {
        Object[] customers= queueCustomer.toArray();
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
        return "";
    }
}
