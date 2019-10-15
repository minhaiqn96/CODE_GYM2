package com.hai.entity;

public abstract class Services {
    public static int services_count = 0;

    private String name_service;
    private float area_used;
    private float fee_rent;
    private int max_people;
    private String type_rent;

    public Services() {
    }

    public Services(String name_service, float area_used, float fee_rent, int max_people, String type_rent) {
        this.name_service = name_service;
        this.area_used = area_used;
        this.fee_rent = fee_rent;
        this.max_people = max_people;
        this.type_rent = type_rent;
    }

    public String getName_service() {
        return name_service;
    }

    public void setName_service(String name_service) {
        this.name_service = name_service;
    }

    public float getArea_used() {
        return area_used;
    }

    public void setArea_used(float area_used) {
        this.area_used = area_used;
    }

    public float getFee_rent() {
        return fee_rent;
    }

    public void setFee_rent(float fee_rent) {
        this.fee_rent = fee_rent;
    }

    public int getMax_people() {
        return max_people;
    }

    public void setMax_people(int max_people) {
        this.max_people = max_people;
    }

    public String getType_rent() {
        return type_rent;
    }

    public void setType_rent(String type_rent) {
        this.type_rent = type_rent;
    }

    public String showInfor(){
        return "Accomodation{" +
                "name_service='" + name_service + '\'' +
                ", area_used=" + area_used +
                ", fee_rent=" + fee_rent +
                ", max_people=" + max_people +
                ", type_rent='" + type_rent + '\'' +
                '}';
    }
}
