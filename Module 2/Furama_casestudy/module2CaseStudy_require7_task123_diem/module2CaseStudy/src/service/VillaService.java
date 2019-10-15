package service;


import model.Villa;


import java.util.Scanner;
public class VillaService {

    public static Villa addNewVilla() {

        Scanner scanner = new Scanner(System.in);
        Villa villa = new Villa();

        System.out.println("Enter Comfort Description");
        villa.setComfortDescription(scanner.nextLine());

        System.out.println("Enter AreaPool :");
        villa.setAreaPool(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter RoomStandard :");
        villa.setRoomStandard(scanner.nextLine()) ;

        System.out.println("Enter floor");
        villa.setFloors(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter rent type");
        villa.setRentType(scanner.nextLine());

        System.out.println("Enter MaxNumberPepole");
        villa.setMaxNumberPepole(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Cost Final");
        villa.setCostFinal(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter Area Used");
        villa.setAreaUsed(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter AccommodationType: (villa)");
        villa.setAccommodationType(scanner.nextLine());

        return villa;

    }



    ;
}
