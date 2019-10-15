package entertainment;

import java.util.ArrayList;

public class Library<E> {wwwwwww
    public ArrayList<E> librarys = new ArrayList<E>();

    public void addElement(E object) {
        librarys.add(object);
    }

    public void removeElement(E object) {
        librarys.remove(object);
    }
}
