package model;

import java.util.Scanner;

public class Customer extends CustomerManager {
    private String fullName;
    private String dayOfBirth;
    private String CMND;
    private String phoneNumber;
    private String email;
    private String guestType;
    private String address;
    private int sale;
    private String serviceType;//Villa, House, Room
    private int totalDateRent;
    private String romeType;//Vip, Business,  Normal


    public Customer() {
    }


    public Customer(String fullName, String dayOfBirth, String CMND, String phoneNumber, String email, String guestType, String address, int sale, String serviceType, int totalDateRent, String romeType) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.sale = sale;
        this.guestType = guestType;
        this.serviceType = serviceType;
        this.totalDateRent = totalDateRent;
        this.romeType = romeType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getTotalDateRent() {
        return totalDateRent;
    }

    public void setTotalDateRent(int totalDateRent) {
        this.totalDateRent = totalDateRent;
    }

    public String getRomeType() {
        return romeType;
    }

    public void setRomeType(String romeType) {
        this.romeType = romeType;
    }

    public float calculateMoneyService(){
    float costFinal=0;
    switch (this.serviceType) {
        case "villa":
            costFinal =  (1 - this.sale/100 )*this.totalDateRent * 500;

            break;
        case "house":
            costFinal =  (1 - this.sale/100 )*this.totalDateRent * 300;

            break;
        case "room":
            costFinal =  (1 - this.sale/100 )*this.totalDateRent * 200;

            break;


    }
    return costFinal;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", CMND='" + CMND + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                ", sale=" + sale +
                ", serviceType='" + serviceType + '\'' +
                ", totalDateRent=" + totalDateRent +
                ", romeType='" + romeType + '\'' +
                '}'+"cost service final"+ calculateMoneyService();
    }





}
