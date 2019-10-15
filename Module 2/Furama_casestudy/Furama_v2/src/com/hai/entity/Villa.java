package com.hai.entity;

import com.hai.entity.Services;

public class Villa extends Services {
    private String standard_room;
    private String other_amenities;
    private float pool_area;
    private int number_floor;

    public Villa() {
    }

    public Villa(String standard_room, String other_amenities, float pool_area, int number_floor) {
        this.standard_room = standard_room;
        this.other_amenities = other_amenities;
        this.pool_area = pool_area;
        this.number_floor = number_floor;
    }

    public Villa(String name_service, float area_used, float fee_rent, int max_people, String type_rent, String standard_room, String other_amenities, float pool_area, int number_floor) {
        super(name_service, area_used, fee_rent, max_people, type_rent);
        this.standard_room = standard_room;
        this.other_amenities = other_amenities;
        this.pool_area = pool_area;
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

    public float getPool_area() {
        return pool_area;
    }

    public void setPool_area(float pool_area) {
        this.pool_area = pool_area;
    }

    public int getNumber_floor() {
        return number_floor;
    }

    public void setNumber_floor(int number_floor) {
        this.number_floor = number_floor;
    }

//    @Override
//    public String showInfor(){
//        return "Villa{" +
//                "standard_room='" + getStandard_room() + '\'' +
//                ", other_amenities=" + getOther_amenities() +
//                ", pool_area=" + getPool_area() +
//                ", number_floor='" + getNumber_floor() + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return super.showInfor() +
                "Villa{" +
                "standard_room='" + standard_room + '\'' +
                ", other_amenities='" + other_amenities + '\'' +
                ", pool_area=" + pool_area +
                ", number_floor=" + number_floor +
                '}';
    }
}
