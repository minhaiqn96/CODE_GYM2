package controller;

import model.House;
import model.Room;
import model.ServiceAb;
import model.Villa;
import service.ApplicationRunningInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.AddNewService.AddNewService;

public class Main1 implements ApplicationRunningInterface {
    static List<ServiceAb> villaList = new ArrayList<>();

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        main1.run();
    }

    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choiceNumber;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. AddNewService");
            System.out.println("2. info House");
            System.out.println("3. nfo Room");
            do {
                System.out.println("Choose request: ");
                choiceNumber = scanner.nextInt();
                switch (choiceNumber) {
                    case 1:
                        AddNewService();
                        break;
                    case 2:
                        AddNewService();
                        break;
                    case 3:
                        AddNewService();

                }
            } while ((choiceNumber < 1) || (choiceNumber > 3));
            break;
        }
    }


    @Override
    public void run() {
        displayMainMenu();
    }
}
