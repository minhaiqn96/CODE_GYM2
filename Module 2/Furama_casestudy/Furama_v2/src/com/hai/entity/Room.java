package com.hai.entity;

public class Room extends Services {

    private String name_service_free;

    public String getName_service_free() {
        return name_service_free;
    }

    public void setName_service_free(String name_service_free) {
        this.name_service_free = name_service_free;
    }

    public Room(String name_service, float area_used, float fee_rent, int max_people, String type_rent, String name_service_free) {
        super(name_service, area_used, fee_rent, max_people, type_rent);
        this.name_service_free = name_service_free;
    }

    @Override
    public String showInfor(){
        return "Room{" +
                "Name_service_free='" + name_service_free + '\'' +
                '}';
    }
}
