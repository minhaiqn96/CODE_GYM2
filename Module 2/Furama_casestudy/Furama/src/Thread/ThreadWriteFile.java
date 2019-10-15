package Thread;

import customer.Customer;

import java.io.*;

public class ThreadWriteFile extends Thread {

    private Thread thread;
    private String threadName;

    public ThreadWriteFile(String name) {
        threadName = name;
        System.out.println("Thread " + name + " is creating...");
    }

    @Override
    public void run() {
        System.out.println("Thread running " + threadName);
        try {
            File f = new File("E:\\CODE GYM\\Module 2\\Furama\\infomationCustomer\\test.txt");
            FileOutputStream fo = new FileOutputStream("E:\\CODE GYM\\Module 2\\Furama\\infomationCustomer\\test.txt");
            ObjectOutputStream o = new ObjectOutputStream(fo);
            for (int i = 0; i < Customer.customerArrayList.size(); i++) {
                o.writeObject(Customer.customerArrayList.get(i));
            }
            o.close();
            fo.close();
            System.out.println("Thread has just done write");
        } catch (Exception e) {
            System.out.println("Thread " + threadName + " is interrupt");
        }
    }
}
