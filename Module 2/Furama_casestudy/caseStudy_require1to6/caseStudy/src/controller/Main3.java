package controller;


import service.ApplicationRunningInterface;


import static model.CustomerManager.addNewCustomer;


public class Main3 implements ApplicationRunningInterface {

    public static void main(String[] args){
        Main3 main3 = new Main3();
        main3.run();
    }

    @Override
    public void run() {
       addNewCustomer();
    }
}
