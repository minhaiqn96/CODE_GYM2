package service;

import model.ServiceAb;
import model.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.HouseService.addNewHouse;
import static service.RoomService.addNewRoom;
import static service.VillaService.addNewVilla;

public class AddNewService {
    static List<ServiceAb> serviceList = new ArrayList<>();

    public static void AddNewService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose type service you want add ");
        int choiceNumber;
        for (; ; ) {
            System.out.println("Menu");
            System.out.println("1. add info Villa");
            System.out.println("2. add info House");
            System.out.println("3. add nfo Room");
            do {
                System.out.println("Choose request: ");
                choiceNumber = scanner.nextInt();
                switch (choiceNumber) {
                    case 1:
                        Villa villa = addNewVilla();
                        serviceList.add(villa);
                        displayList();
                        break;
                    case 2:
                        serviceList.add(addNewHouse());
                        break;
                    case 3:
                        serviceList.add(addNewRoom());

                }
            } while ((choiceNumber < 1) || (choiceNumber > 3));

        }
    }

    public static void displayList() {
        for (ServiceAb serviceAb : serviceList) {
            System.out.println(serviceAb.showInfor());
        }
    }
}
