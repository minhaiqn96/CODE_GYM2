package service;

import model.House;
import model.Room;

import java.util.Scanner;

public class RoomService {
    public static Room addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();

        System.out.println("Enter AccommodationType: (room)");
        room.setAccommodationType(scanner.nextLine());


        System.out.println("Enter rent type");
        room.setRentType(scanner.nextLine());

        System.out.println("Enter MaxNumberPepole");
        room.setMaxNumberPepole(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Cost Final");
        room.setCostFinal(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Area User");
        room.setAreaUsed(scanner.nextInt());
        scanner.nextLine();


        System.out.println("Enter  Accompanied Service");
        room.setAccompaniedService(scanner.nextLine());

        return room;

    }

}
