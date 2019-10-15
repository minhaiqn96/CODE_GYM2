package model;

public abstract class ServiceAb {
    private String accommodationType;
    private double areaUsed;
    private double costFinal;
    private int maxNumberPepole;
    private String rentType;

    public ServiceAb(){};

    public ServiceAb(String accommodationType, double areaUsed, double costFinal, int maxNumberPepole, String rentType) {
        this.accommodationType = accommodationType;
        this.areaUsed = areaUsed;
        this.costFinal = costFinal;
        this.maxNumberPepole = maxNumberPepole;
        this.rentType = rentType;


    }

    public void setAccommodationType(String accommodationType){
        this.accommodationType = accommodationType;
    }
    public String getAccommodationType (){
        return accommodationType;
    }

    public void setAreaUsed(double areaUsed){
        this.areaUsed = areaUsed;

    }
     public double getAreaUsed(){
        return areaUsed;
     }

     public void setCostFinal (double costFinal){
        this.costFinal = costFinal;
     }

     public  double getCostFinal(){
        return costFinal;
     }

     public void setMaxNumberPepole(int maxNumberPepole){
        this.maxNumberPepole = maxNumberPepole;
     }

     public int getMaxNumberPepole(){
        return maxNumberPepole;
     }

     public  void setRentType(String rentType){
        this.rentType = rentType;
     }

     public  String getRentType(){
        return rentType;
     }

     public String showInfor(){
         return "Info Service{" +
                 "accommodationType='" + accommodationType + '\'' +
                 ", areaUser=" + areaUsed +
                 ", costFinal=" + costFinal +
                 ", maxNumberPepole=" + maxNumberPepole +
                 ", rentType='" + rentType + '\'' ;
     }




}
