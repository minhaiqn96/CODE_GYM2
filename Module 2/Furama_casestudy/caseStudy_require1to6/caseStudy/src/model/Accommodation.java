package model;

public abstract class  Accommodation {
    private String accommodationType;
    private double areaUser;
    private double costFinal;
    private int maxNumberPepole;
    private byte rentType;
    private static int service_count = 0;

    public Accommodation() {
    }


    public Accommodation(String accommodationType, double areaUser, double costFinal, int maxNumberPepole, byte rentType) {
        this.accommodationType = accommodationType;
        this.areaUser = areaUser;
        this.costFinal = costFinal;
        this.maxNumberPepole = maxNumberPepole;
        this.rentType = rentType;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public double getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(double areaUser) {
        this.areaUser = areaUser;
    }

    public double getCostFinal() {
        return costFinal;
    }

    public void setCostFinal(double costFinal) {
        this.costFinal = costFinal;
    }

    public int getMaxNumberPepole() {
        return maxNumberPepole;
    }

    public void setMaxNumberPepole(int maxNumberPepole) {
        this.maxNumberPepole = maxNumberPepole;
    }

    public byte getRentType() {
        return rentType;
    }

    public void setRentType(byte rentType) {
        this.rentType = rentType;
    }

    public static int getService_count() {
        return service_count;
    }

    public static void setService_count(int service_count) {
        Accommodation.service_count = service_count;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "accommodationType='" + accommodationType + '\'' +
                ", areaUser=" + areaUser +
                ", costFinal=" + costFinal +
                ", maxNumberPepole=" + maxNumberPepole +
                ", rentType=" + rentType +
                '}';
    }
}
