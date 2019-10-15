package com.hai.service;

import com.hai.entity.Services;
import com.hai.entity.Villa;

import java.util.Scanner;

public class VillaService {

    public Villa addNewService() {
        Villa villa = new Villa();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name service: ");
        String name = scanner.nextLine();
        villa.setName_service(name);

        float area;
        do {
            System.out.print("Enter Area Used: ");
            area = scanner.nextFloat();
            villa.setArea_used(area);
        } while (area <= 0 || area > 30);

        System.out.print("Enter Fee rent: ");
        Float fee = scanner.nextFloat();
        villa.setFee_rent(fee);

        System.out.print("Enter max people: ");
        Integer max_people = scanner.nextInt();
        villa.setMax_people(max_people);

        scanner.nextLine();

        System.out.print("Enter type rent: ");
        String type = scanner.nextLine();
        villa.setType_rent(type);

        System.out.print("Enter standard room: ");
        String standard = scanner.nextLine();
        villa.setStandard_room(standard);

        System.out.print("Enter other amenities: ");
        String amenities = scanner.nextLine();
        villa.setOther_amenities(amenities);

        System.out.print("Enter pool area: ");
        Float area_pool = scanner.nextFloat();
        villa.setPool_area(area_pool);

        System.out.print("Enter number floor: ");
        Integer number_floor = scanner.nextInt();
        villa.setNumber_floor(number_floor);

        Services.services_count++;

        return villa;
    }

    public void showInfo() {

        System.out.println("Amount service: " + Services.services_count);
//        return villa.toString();
    }


}