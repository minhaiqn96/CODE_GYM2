package service;

import model.House;
import model.Villa;

import java.util.Scanner;

public class HouseService {
    public static House addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println("Enter Comfort Description");
        house.setComfortDescription(scanner.nextLine());



        System.out.println("Enter RoomStandard :");
        house.setRoomStandard(scanner.nextLine()); ;

        System.out.println("Enter floor");
        house.setFloors(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter rent type");
        house.setRentType(scanner.nextLine());

        System.out.println("Enter MaxNumberPepole");
        house.setMaxNumberPepole(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Cost Final");
        house.setCostFinal(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Area User");
        house.setAreaUsed(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter AccommodationType: (house)");
        house.setAccommodationType(scanner.nextLine());


        return house;

    }


}
