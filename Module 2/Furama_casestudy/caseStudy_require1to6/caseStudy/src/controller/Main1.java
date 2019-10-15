package controller;

import service.ApplicationRunningInterface;

import static model.CustomerManager.addNewCustomer;


public class Main1 implements ApplicationRunningInterface {
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.run();
    }

    @Override
    public void run() {
        addNewCustomer();
    }
}
