import java.util.Stack;

public class FilingCabinet {

    public static Stack<InfoEmployee> cabinets = new Stack<InfoEmployee>();

    public void addElement(InfoEmployee object) {
        cabinets.push(object);
    }

    public void removeElement(InfoEmployee object) {
        cabinets.remove(object);
    }

    public void seachInfoEmployee(String name) {
        InfoEmployee eSearch = null;
        for (int i = 0; i < cabinets.size(); i++) {
            if (name.equals(cabinets.get(i).getName())) {
                eSearch = cabinets.get(i);
            }
        }
        if (eSearch != null){
            System.out.println(eSearch);
        }else {
            System.out.println("Khong tim thay");
        }

    }
}

