package model;

public class House extends ServiceAb{
    private String comfortDescription;
    private String roomStandard ;
    private int floors;


    public House() {
    }


    public House(String accommodationType, double areaUsed, double costFinal, int maxNumberPepole, String rentType, String comfortDescription, String roomStandard, int floors) {
        super(accommodationType, areaUsed, costFinal, maxNumberPepole, rentType);
        this.comfortDescription = comfortDescription;
        this.floors = floors;
        this.roomStandard = roomStandard;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String standardRoom) {
        this.roomStandard = standardRoom;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+
                "House{" +
                "comfortDescription='" + comfortDescription + '\'' +
                ", standardRoom='" + roomStandard + '\'' +
                ", floors=" + floors +
                '}';
    }


}

