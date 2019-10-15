package customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer implements Serializable {

    public String name;
    public int age;
    public static List<Customer> customerArrayList = new ArrayList<Customer>();
    public static Map<Integer, Object> map = new HashMap<Integer, Object>();

    static {
        Customer cus1 = new Customer("MinhHai", 20);
        Customer.customerArrayList.add(cus1);
        Customer cus2 = new Customer("LyNa", 30);
        Customer.customerArrayList.add(cus2);
    }

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}