import accomodation.House;
import accomodation.Villa;
import customer.Customer;
import entertainment.Book;
import entertainment.Library;

import java.util.*;

public class Furama {

    public static void main(String[] args) {
        Villa villa = new Villa();
        House house = new House();
        Customer customer = new Customer();
        SwimmingPool swimmingPool = new SwimmingPool();
        System.out.print("Amount money u need pay: ");
        System.out.println(villa.payMent(4));

        System.out.println("Furama begin at: " + swimmingPool.getBeginHour());
        swimmingPool.checkinCustomerHour(7);
        swimmingPool.checkinCustomerHour(9);
        swimmingPool.checkDaysAccommodation(100);
        swimmingPool.checkDaysAccommodation(10);

        house.setHouses(house.houses());
        for (int i = 0; i < house.getHouses().length; i++) {
            System.out.println(house.getHouses()[i] + " ");
        }
        villa.setVillas(villa.villas());
        for (int i = 0; i < villa.getVillas().length; i++) {
            System.out.println(villa.getVillas()[i] + " ");
        }

        Customer cus1 = new Customer("A", 12);
        customer.customerArrayList.add(cus1);
        Customer cus2 = new Customer("B", 13);
        customer.customerArrayList.add(cus2);
        Customer cus3 = new Customer("C", 14);
        customer.customerArrayList.add(cus3);
        Customer cus4 = new Customer("D", 15);
        customer.customerArrayList.add(cus4);
        Customer cus5 = new Customer("E", 16);
        customer.customerArrayList.add(cus5);
        for (Customer cus : Customer.customerArrayList) {
            System.out.println(cus.getName() + "- " + cus.getAge());
        }

        Library<Book> bookList = new Library<Book>();
        Book book1 = new Book("qwe", 50, "1233");
        bookList.addElement(book1);
        Book book2 = new Book("abc", 100, "oqp");
        bookList.addElement(book2);
        Book book3 = new Book("987", 100, "456");
        bookList.addElement(book3);

        for (Book bok : bookList.librarys) {
            System.out.println(bok);
        }
        System.out.println("------");
        bookList.removeElement(book2);
        for (Book bok : bookList.librarys) {
            System.out.println(bok);
        }

        for (int i = 0; i < customer.customerArrayList.size(); i++) {
            System.out.println(customer.customerArrayList.get(i));
        }
        System.out.println("--------");

        customer.map.put(1, customer.customerArrayList.get(0));
        customer.map.put(2, customer.customerArrayList.get(1));
        customer.map.put(3, customer.customerArrayList.get(2));
        customer.map.put(4, customer.customerArrayList.get(3));
        customer.map.put(5, customer.customerArrayList.get(4));
        Set<Integer> set = customer.map.keySet();
        for (Integer key : set) {
            System.out.println(key + ": " + customer.map.get(key));
        }

        CountBicycle.hashSetInteger.add(3565);
        CountBicycle.hashSetInteger.add(1234);
        CountBicycle.hashSetInteger.add(9876);
        System.out.println("License plates: ");
        System.out.println(CountBicycle.hashSetInteger);
        System.out.println("Amount bicycle pass Furama resort today is: " + CountBicycle.hashSetInteger.size());

        Cinema cinema = new Cinema();

        System.out.println("Customers buyed ticket today: ");
        System.out.print(cinema);

        FilingCabinet employList = new FilingCabinet();
        InfoEmployee employee1 = new InfoEmployee("Hai", 24, "IT engineer");
        employList.addElement(employee1);
        InfoEmployee employee2 = new InfoEmployee("Jacky", 25, "Chef");
        employList.addElement(employee2);
        InfoEmployee employee3 = new InfoEmployee("Tyn", 26, "F&B");
        employList.addElement(employee3);

        System.out.println("----------");
//        while (!employList.cabinets.isEmpty()) {
//            InfoEmployee employee = employList.cabinets.pop();
//            System.out.println(employee);
//        }

        employList.seachInfoEmployee("Hai1");
        employList.seachInfoEmployee("Hai");
        employList.seachInfoEmployee("");
    }
}