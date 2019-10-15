package Thread;

import customer.Customer;

public class ThreadTest {

    public static void main(String[] args) {

        try {
            while (true) {
                ThreadWriteFile threadWrite = new ThreadWriteFile("Thread-1...");
                threadWrite.start();
                Thread.sleep(2000);//19h-8h: 13 * 60 * 60 * 1000
                System.out.println();
                ThreadReadFile threadRead = new ThreadReadFile("Read file...");
                threadRead.start();
                Thread.sleep(5000);//8-19h: 11*60*60*1000
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            System.out.println("This thread has stopped!!!");
        }
        System.out.println("Main stop");
    }
}