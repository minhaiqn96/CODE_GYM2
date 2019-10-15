package Thread;

import customer.Customer;

import java.io.*;

public class ThreadReadFile extends Thread {

    private Thread thread;
    private String threadName;

    public ThreadReadFile(String name) {
        threadName = name;
//        System.out.println("Thread " + name + " is reading...");
    }

    @Override
    public void run() {
        System.out.println("Begin running " + threadName);

        try {
            FileInputStream fi = new FileInputStream(new File("E:\\CODE GYM\\Module 2\\Furama\\infomationCustomer\\test.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Customer ci1 = (Customer) oi.readObject();
            Customer ci2 = (Customer) oi.readObject();
            System.out.println(ci1.toString());
            System.out.println(ci2.toString());
            oi.close();
            fi.close();
        } catch (Exception e) {
            System.out.println("Thread " + threadName + " is interrupt");
        }
    }
}
