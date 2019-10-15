package model;

public class Room extends ServiceAb {

    private String accompaniedService;

    public Room() {
    }

    public Room(String accommodationType, double areaUsed, double costFinal, int maxNumberPepole,String rentType, String accompaniedService) {
        super(accommodationType, areaUsed, costFinal, maxNumberPepole, rentType);
        this.accompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void  setAccompaniedService(String serviceFree) {
        this.accompaniedService = serviceFree;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+
                "Room{" +
                "serviceFree='" + accompaniedService + '\'' +
                '}';
    }

}
