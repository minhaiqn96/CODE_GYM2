package model;

public class House extends Accommodation{
    private String comfortDescription;
    private String standardRoom;
    private int floors;

    public House() {
    }


    public House(String accommodationType, double areaUser, double costFinal, int maxNumberPepole, byte rentType, String comfortDescription, String standardRoom, int floors) {
        super(accommodationType, areaUser, costFinal, maxNumberPepole, rentType);
        this.comfortDescription = comfortDescription;
        this.standardRoom = standardRoom;
        this.floors = floors;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "comfortDescription='" + comfortDescription + '\'' +
                ", standardRoom='" + standardRoom + '\'' +
                ", floors=" + floors +
                '}';
    }
}

