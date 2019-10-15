package model;

public class Villa extends Accommodation {
    private String comfortDescription;
    private String moTaTienNghi;
    private int floors;
    private float areaPool;


    public Villa() {
    }

    public Villa(String accommodationType, double areaUser, double costFinal, int maxNumberPepole, byte rentType, String comfortDescription, String moTaTienNghi, int floors, float areaPool) {
        super(accommodationType, areaUser, costFinal, maxNumberPepole, rentType);
        this.comfortDescription = comfortDescription;
        this.moTaTienNghi = moTaTienNghi;
        this.floors = floors;
        this.areaPool = areaPool;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
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
    public String toString() {
        return "Villa{" +
                "comfortDescription='" + comfortDescription + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", floors=" + floors +
                ", areaPool=" + areaPool +
                '}';
    }
}
