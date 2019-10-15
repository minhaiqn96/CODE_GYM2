package model;

public class Room extends Accommodation {
    private String serviceFree;

    public Room() {
    }

    public Room(String accommodationType, double areaUser, double costFinal, int maxNumberPepole, byte rentType, String serviceFree) {
        super(accommodationType, areaUser, costFinal, maxNumberPepole, rentType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
