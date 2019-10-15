package model;

public class Villa extends ServiceAb {
    private String comfortDescription;
    private String roomStandard ;
    private int floors;
    private float areaPool;


    public Villa() {
    }

    public Villa(String accommodationType, double areaUsed, double costFinal, int maxNumberPepole, String rentType, String comfortDescription, String roomStandard, int floors, float areaPool) {
        super(accommodationType, areaUsed, costFinal, maxNumberPepole, rentType);
        this.comfortDescription = comfortDescription;
        this.roomStandard = roomStandard;
        this.floors = floors;
        this.areaPool = areaPool;
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

    public void setRoomStandard(String moTaTienNghi) {
        this.roomStandard = moTaTienNghi;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+

                "comfortDescription='" + comfortDescription + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                ", areaPool=" + areaPool +
                '}';

    }


}
