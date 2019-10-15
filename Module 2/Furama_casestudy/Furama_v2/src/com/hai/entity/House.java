package com.hai.entity;

public class House extends Services {
    private String standard_room;
    private String other_amenities;
    private int number_floor;

    public House(String name_service, float area_used, float fee_rent, int max_people, String type_rent, String standard_room, String other_amenities, int number_floor) {
        super(name_service, area_used, fee_rent, max_people, type_rent);
        this.standard_room = standard_room;
        this.other_amenities = other_amenities;
        this.number_floor = number_floor;
    }

    public House(String standard_room, String other_amenities, int number_floor) {
        this.standard_room = standard_room;
        this.other_amenities = other_amenities;
        this.number_floor = number_floor;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getOther_amenities() {
        return other_amenities;
    }

    public void setOther_amenities(String other_amenities) {
        this.other_amenities = other_amenities;
    }

    public int getNumber_floor() {
        return number_floor;
    }

    public void setNumber_floor(int number_floor) {
        this.number_floor = number_floor;
    }

    @Override
    public String showInfor(){
        return "House{" +
                "standard_room='" + standard_room + '\'' +
                ", other_amenities=" + other_amenities +
                ", number_floor='" + number_floor + '\'' +
                '}';
    }
}
